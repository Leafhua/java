package day8;

import java.util.Scanner;

public class 猫类 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        cat a,b ;
        System.out.println("第一只猫品种，颜色，性别");
        a = new cat(reader.next(),reader.next(),reader.next());
        System.out.println("第二只猫品种，颜色，性别");
        b = new cat(reader.next(),reader.next(),reader.next());
        a.eat();b.eat();
        a.catchRat();b.catchRat();
    }
}
class cat{
    String name,color,sex;

    public cat(String name, String color, String sex) {
        this.name = name;
        this.color = color;
        this.sex = sex;
    }
    void eat(){
        System.out.println(this.name+"吃食！！！");
    }
    void catchRat(){
        System.out.println(name+"猫抓老鼠！！！");
    }

}