package test4_26;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class 随机存入TreeSet {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();
        for (int i = 0; i <10 ; i++) {
            ts.add((int)(Math.random()*100)+1);
        }
        Iterator<Integer>iter = ts.iterator();
        System.out.println("通过迭代器输出TreeSet里10个随机数");
        while (iter.hasNext())
        {
            System.out.print(iter.next()+" ");
        }
    }
}
