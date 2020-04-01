package day7;

import java.util.Scanner;

public class 人类 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("输入姓名，性别，年龄:");
        person guapi = new person();
        guapi.setName(reader.next());
        guapi.setGender(reader.next());
        guapi.setAge(reader.nextInt());
        guapi.sleep();
        guapi.work();
        guapi.work();
        guapi.work();
        guapi.Introduction();
    }
}
class person extends object{
    void sleep(){
        System.out.println("睡觉中");
    }
    void work(){
        System.out.println("工作中~~~~~~~~");
    }
    void Introduction(){
        System.out.println(this.toString());
    }
}
