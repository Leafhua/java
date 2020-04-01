package day6;

import java.util.Scanner;

public class 定义方法计算能被3或7整除的数的和 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("计算1到几以内能被7整除但不是偶数的数的个数：");
        int n = reader.nextInt();
        System.out.println("个数为:"+sum(n));
    }
    static int sum(int n){
        int flg=0;
        for (int i = 1; i <n ; i++) {
            if (i%7==0&&i%2==0){
                flg++;
            }
        }
        return flg;
    }
}
