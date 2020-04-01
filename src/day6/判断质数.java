package day6;

import java.util.Scanner;

public class 判断质数 {
    public static void main(String[] args) {
        System.out.println("输入需要检测的数：");
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        if(prime(n)==0)
            System.out.println("该数为质数");
        else
            System.out.println("该数不是质数");

    }
    public static int prime(int n){
        for (int i = 2; i <n ; i++) {
            if(n%i==0)
                return 1;
        }
        return 0;
    }
}
