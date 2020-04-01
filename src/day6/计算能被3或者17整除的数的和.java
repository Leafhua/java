package day6;

import java.util.Scanner;

public class 计算能被3或者17整除的数的和 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("计算1到几内能被3或者17整除的数的和：");
        int n = reader.nextInt();
        System.out.println("和为："+sum(n));
    }
    public static int sum(int n){
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            if (i%17==0&&i%3==0){
                sum+=i;
            }
        }
        return sum;
    }
}
