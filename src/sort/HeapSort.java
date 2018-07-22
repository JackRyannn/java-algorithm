package sort;

import tools.Rand;

/**
 * Created by RenChao on 18/7/21.
 */
public class HeapSort extends BaseSort {
    public HeapSort() {
        int[] randList = Rand.produce(10);
        list = new int[randList.length+1];
        list[0] = 0;
        System.arraycopy(randList,0,list,1,randList.length);
    }

    @Override
    public void setList(int[] list) {
        this.list = new int[list.length+1];
        this.list[0] = 0;
        System.arraycopy(list,0,this.list,1,list.length);
        super.setList(list);
    }

    @Override
    public int[] run() {
        build();

        for (int i = list.length - 1; i > 1; i--) {
            adjust(1, i);
            int tmp = list[1];
            list[1] = list[i];
            list[i] = tmp;
        }
        return list;
    }

    private void build() {
        for (int i = list.length/2; i > 0; i--) {
            adjust(i, list.length - 1);
        }
    }

    private void adjust(int start,int end) {
        int tmp;
        for(int i = start;i*2<=end;){
            int p = 2*i;
            if(i*2+1<=end && list[i*2+1]>list[i*2])
                p += 1;
            if(operator(list[p],list[i])>0){
                tmp = list[p];
                list[p] = list[i];
                list[i] = tmp;
                i = p;
            }else{
                break;
            }
        }
    }

    @Override
    public String toString() {
        String s = "排序结果为："+"\n";
        for(int i = 1;i<list.length;i++){
            s += list[i] + " ";
        }
        return s;    }
}
