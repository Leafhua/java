package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 计算得分 {
    public static void main(String[] args) {
        int a;
        Scanner reader = new Scanner(System.in);
        System.out.println("有多少个评委？");
        a = reader.nextInt();
        float score[] = new float[a];
        for (int i = 0; i <a ; i++) {
            System.out.println("评委"+(i+1)+"评分:");
            score[i] = reader.nextFloat();
        }
        Arrays.sort(score);
        float sum = 0;
        for (int i = 1; i <a-1 ; i++) {
            sum+=score[i];
        }
        System.out.println("该选手最终得分为"+sum/(a-2));
    }
}
