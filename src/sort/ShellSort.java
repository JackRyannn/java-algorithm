package sort;

/**
 * Created by RenChao on 18/7/22.
 * 希尔排序又称缩小增量排序
 * 分组后用直接插入排序
 */
public class ShellSort extends BaseSort {
    private static int delta =5;

    @Override
    public int[] run() {
        int gap = list.length / delta;
        while (gap >= 0) {
            if(gap<1)
                gap = 1;

            for (int i = 0; i < gap; i++) {
                for (int m = i; m + gap < list.length; m += gap) {
                    if (operator(list[m + gap], list[m]) < 0) {
                        int n = m;
                        int k = list[m + gap];
                        int tmp;
                        for (; n >= 0; n -= gap) {
                            if (operator(list[n], k) > 0) {
                                tmp = list[n + gap];
                                list[n + gap] = list[n];
                                list[n] = tmp;
                            }
                        }
                    }
                }
            }
            if(gap==1)
                break;
            gap /= delta;

        }

        return list;
    }
}
