package sort;

/**
 * Created by RenChao on 18/7/17.
 */
public class SelectSort extends BaseSort {

    public int[] run() {
        int m = list[0];
        int index = 0;
        for (int i = list.length - 1; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                if(operator(m,list[j])<0){
                    index = j;
                    m = list[j];
                }
            }
            int tmp = list[i];
            list[i] = list[index];
            list[index] = tmp;
            index = 0;
            m = list[0];
        }
        return list;
    }

}
