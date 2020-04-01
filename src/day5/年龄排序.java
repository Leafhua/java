package day5;

import java.util.Scanner;

public class 年龄排序 {
    public static void main(String[] args) {


        int age[] = new int[5];
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("输入第"+(i+1)+"个学生年龄");
            age[i] = reader.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <4 ; j++) {
                if(age[j]<age[j+1]){
                int temp;
                temp = age[j+1];
                age[j+1] = age[j];
                age[j] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("第"+(i+1)+"个学生年龄是"+age[i]);
        }

    }
}
