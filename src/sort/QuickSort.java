package sort;

/**
 * Created by RenChao on 18/7/19.
 */
public class QuickSort extends BaseSort{

    @Override
    public int[] run() {
        partition(0,list.length-1);
        return list;
    }

    private void partition(int start,int end){
        if (start>=end)
            return;
        int p_start = start;
        int p_end = end;
        int key = list[start];
        while(start<end) {
            while (list[end] >= key && end>start) {
                end--;
            }
            list[start] = list[end];
            while (list[start] <= key && end>start){
                start++;
            }
            list[end] = list[start];
        }
        list[start] = key;
        if(start-1>p_start)
            partition(p_start,start-1);
        if(end+1<p_end);
            partition(end+1,p_end);

    }
}
