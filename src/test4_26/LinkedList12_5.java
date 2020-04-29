package test4_26;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList12_5 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <11 ; i++) {
            list.add(i);
        }
        System.out.println("表中的数据为：");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
        {
            Integer num = iterator.next();
            System.out.print(num.intValue()+" ");
        }
        System.out.println();
        System.out.println("删除标号为4的元素");
        list.remove(4);
        System.out.println("删除后表中的数据为:");
        iterator = list.iterator();
        while (iterator.hasNext())
        {
            Integer num = iterator.next();
            System.out.print(num.intValue()+" ");
        }

    }
}
