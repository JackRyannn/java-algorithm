package sort;


import tools.Rand;

/**
 * Created by RenChao on 18/7/18.
 */
public abstract class BaseSort {
    //  默认是升序，改成true则为降序
    public static boolean reverse = false;

    public static void setReverse(boolean reverse) {
        BaseSort.reverse = reverse;
    }

    int[] list;
    public BaseSort(){
        this.list = Rand.produce(10);
    }
    public void setList(int[] list) {
        if(list.length<=0)
        {
            System.out.println("排序数组不能为空!");
        }
        this.list = list;
    }

    public abstract int[] run();

    public void exec(){
        long startTime = System.nanoTime();
        run();
        long endTime = System.nanoTime();
        float excTime = (float) (endTime - startTime)/1000;
        System.out.println("运行时长:"+excTime+"毫秒");
    }

    protected int operator(int a, int b) {
        int ret = 0;
        if (a > b)
            ret = 1;
        if (a < b)
            ret = -1;
        if (a == b)
            ret = 0;
        if (reverse)
            ret = 0 - ret;
        return ret;
    }

    public String toString(){
        String s = "排序结果为："+"\n";
        for(int i:list){
            s += i + " ";
        }
        return s;
    }
}
