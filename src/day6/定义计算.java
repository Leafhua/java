package day6;

import java.util.Scanner;

public class 定义计算 {
    public static void main(String[] args) {
        System.out.println("输入要计算1到几的奇数和：");
        Scanner reader = new Scanner(System.in);
        int n ;
        n = reader.nextInt();
        System.out.println("1到"+n+"的奇数和为"+add(n));
    }
    static int add(int n){
        int sum=0;
        for (int i = 1; i <=n ; i+=2) {
            sum+=i;
        }
        return sum;
    }
}
