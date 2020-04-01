package test3_30;

import java.util.Scanner;

public class test3 {
    static void sanjiao(int a, int b, int c) throws IllegalArgumentException
    {

        if (a+b<=c||a+c<=b||b+c<=a) {
            throw new IllegalArgumentException();
        }
        else{
        System.out.println("三角形三个边长分别是：" + a + " " + b + "  " + c);
        }

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("输入三角形三个边长：");
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        try {
            sanjiao(a, b, c);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.out.println("不能构成三角形");
        }
    }
}
