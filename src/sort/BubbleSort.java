package sort;

/**
 * Created by RenChao on 18/7/17.
 */
public class BubbleSort extends BaseSort {

    public int[] run() {
        for (int i = list.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (operator(list[j], list[j + 1]) >= 0) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        return list;
    }

}
