package test4_26;

import java.util.HashMap;
import java.util.Set;

public class test12_5 {
    public static void main(String[] args) {
        String cw[] = {"音乐","舞蹈","小汽车","男人","女人","男孩","女孩"};
        String ew[] = {"music","dance","car","man","woman","boy","gril"};
        HashMap<String ,String> hm = new HashMap<>();
        for (int i = 0; i < cw.length; i++) {
            hm.put(cw[i],ew[i]);
        }
        System.out.println("共有"+hm.size()+"个单词");
        System.out.println(hm);
        System.out.println(hm.get("男人"));
        hm.remove("小汽车");
        Set<String> keys=hm.keySet();
        for (String s:keys)
        {
            System.out.println(s+" ");
        }
    }
}
