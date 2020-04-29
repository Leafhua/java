package test4_26;

import java.util.HashSet;
import java.util.Set;

public class 集合12_7 {
    public static void main(String[] args) {
        Set<Integer> A = new HashSet<>();
        for (int i = 1; i <5 ; i++) {
            A.add(i);
        }
        Set<Integer> B =new HashSet<>();
        for (int i = 1; i <12 ; i+=2) {
            B.add(i);
        }
        System.out.println("集合A为："+A);
        System.out.println("集合B为："+B);
        Set<Integer> C  = new HashSet<>();
        C.clear();
        C.addAll(A);
        C.retainAll(B);
        System.out.println("交集为："+C);
        C.clear();
        C.addAll(A);
        C.addAll(B);
        System.out.println("并集为："+C);
        C.clear();
        C.addAll(B);
        C.removeAll(A);
        System.out.println("差集B-A为："+C);
        C.clear();
        C.addAll(A);
        C.removeAll(B);
        System.out.println("差集A-B为："+C);

    }

}
