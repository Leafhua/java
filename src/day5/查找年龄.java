package day5;

import java.util.Scanner;

public class 查找年龄 {
    public static void main(String[] args) {
        int a;
        System.out.println("有多少个学生?");
        Scanner reader = new Scanner(System.in);
        a = reader.nextInt();
        int age[] = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("请录入第"+(i+1)+"个学生的年龄");
            age[i] = reader.nextInt();
        }
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j <a-1 ; j++) {
                if (age[j]>age[j+1]){
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
        int mid,start=0,end=a-1,value;
        mid = (start+end)/2;
        System.out.println("请输入需要查找的年龄");
        value = reader.nextInt();
        while (start>end){
            if (value == age[mid]){
                break;
            }
            else if(value>age[mid]){
                start = mid+1;
            }
            else if (value<age[mid]){
                end = mid-1;
            }
            mid = (start+end)/2;
        }
        System.out.println("年龄为"+value+"的学生序号是"+mid);

    }
}
