package sort;

/**
 * Created by RenChao on 18/7/22.
 * 空间复杂度o(n)
 * 递归调用
 */
public class MergeSort extends BaseSort {
    @Override
    public int[] run() {
        merge(0,list.length-1);
        return list;
    }


    public void merge(int start, int end) {
        int mid = (start + end) / 2;
        if (start == end)
            return;
        if (start == mid) {
            if (list[start] > list[end]) {
                int tmp = list[start];
                list[start] = list[end];
                list[end] = tmp;
            }
            return;
        }

        merge(start, mid - 1);
        merge(mid, end);

        int p = start;
        int q = mid;
        int i = 0;
        int[] l = new int[end - start + 1];
        while (p < mid && q <= end) {
            if (list[p] <= list[q]) {
                l[i] = list[p];
                p++;
            } else {
                l[i] = list[q];
                q++;
            }
            i++;
        }
        while (p < mid) {
            l[i] = list[p];
            i++;
            p++;
        }
        while (q <= end) {
            l[i] = list[q];
            i++;
            q++;
        }
        for(int j=0;j<i;j++){
            list[j+start] = l[j];
        }

    }
}
