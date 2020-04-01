package day6;

import java.util.Scanner;

public class 求素数个数 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("求2到几的素数个数：");
        int n = reader.nextInt();
        System.out.println("个数为："+sum(n));

    }
    public static int sum(int n ){
        int flg=0;
        for (int i = 2; i <=n ; i++) {
            if(prime(i)==0) {
                flg++;
            }
        }
        return flg;
    }
    public static int prime(int n){
        for (int i = 2; i <n ; i++) {
            if(n%i==0)
                return 1;
        }
        return 0;
    }
}
