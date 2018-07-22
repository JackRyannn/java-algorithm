package sort;

/**
 * Created by RenChao on 18/7/18.
 */
public class InsertSort extends BaseSort {
    @Override
    public int[] run() {
        int tmp = 0;
        int index = 0;
        for (int i = 0; i < list.length - 1; i++) {
            if (operator(list[i + 1], list[i]) < 0) {
                for (int j = 0; j <= i; j++) {
                    if (operator(list[j], list[i + 1]) > 0) {
                        index = j;
                        tmp = list[i + 1];
                        break;
                    }
                }
                int k = i + 1;
                while (k > index) {
                    list[k] = list[k - 1];
                    k--;
                }
                list[index] = tmp;
            }
        }
        return list;
    }
}
