package tools;

import java.util.Random;

/**
 * Created by RenChao on 18/7/17.
 */
public class Rand {
    public static int[] produce(int num){
        Random random = new Random();
        int[] list = new int[num];
        for(int i=0;i<num;i++){
            list[i] = i+1;
        }
        for(int j=num-1;j>0;j--){
            int r = random.nextInt(num)%j;
            int tmp = list[j];
            list[j] = list[r];
            list[r] = tmp;
        }
        System.out.println("待排序数组：");
        for(int i:list)
            System.out.print(i+" ");
        System.out.println();
        return list;
    }
}
