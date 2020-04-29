package test4_26;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 随机存入HashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <10 ; i++) {
            int n = (int)(Math.random()*100)+1;
            set.add(n);
        }
        Iterator<Integer> iter = set.iterator();
        System.out.println("通过迭代器输出HashSet里的10个随机数");
        while (iter.hasNext())
        {
            System.out.print(iter.next()+" ");
        }

    }
}
