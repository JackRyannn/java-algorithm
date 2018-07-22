import sort.BaseSort;
import sort.ShellSort;

/**
 * Created by RenChao on 18/7/17.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
//        选择一种排序方法并实例化
        BaseSort sort = new ShellSort();
//        可以设置待排序数组的长度
//        sort.setList(Rand.produce(10000));
        sort.setReverse(true);
        sort.exec();
        System.out.println(sort.toString());

    }
}
