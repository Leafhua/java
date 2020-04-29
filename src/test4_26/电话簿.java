package test4_26;

import java.util.*;

public class 电话簿 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Map<String,Integer>phoneNumber = new HashMap<>();
        System.out.println("存入5个公司和公司号码");
        for (int i = 0; i <5 ; i++) {
            System.out.print("公司名字：");
            String a = reader.next();
            System.out.print("公司号码：");
            int b = reader.nextInt();
            phoneNumber.put(a,b);
        }
        Set keys = phoneNumber.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext())
        {
            String company = it.next();
            int number = phoneNumber.get(company);
            System.out.println(company+" "+number);
        }
        System.out.println("删除操作，请输入需要删除的公司名字：");
        phoneNumber.remove(reader.next());
        System.out.println("删除后结果为：");
        keys = phoneNumber.keySet();
        it = keys.iterator();
        while (it.hasNext())
        {
            String company = it.next();
            int number = phoneNumber.get(company);
            System.out.println(company+" "+number);
        }
        System.out.println("查询操作，请输入需要查询的公司名字：");
        System.out.println("公司电话为："+phoneNumber.get(reader.next()));
    }
}
