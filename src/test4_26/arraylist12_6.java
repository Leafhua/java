package test4_26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class arraylist12_6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("请输入5个数据");
        for (int i = 0; i <5 ; i++) {
            System.out.println("请输入第"+(i+1)+"个数据");
            list.add(reader.next());
        }
        int index;
        for(;;) {
            System.out.println("输入想查询元素下标：");
            index = reader.nextInt();
            if (index > 5 || index < 0) {
                System.out.println("输入错误");
            }
            else break;
        }
        System.out.println(list.get(index));


    }
}
