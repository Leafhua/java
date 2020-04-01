package day8;

import java.util.Scanner;

public class 动物类 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Animal2G cat,dog;
        System.out.println("输入动物数据：");
        cat = new Animal2G(reader.next(),reader.next());
        System.out.println("输入动物数据：");
        dog = new Animal2G(reader.next(),reader.next());
        System.out.println(cat.eat()+"小鱼干,瓜皮般"+cat.sleep());
        System.out.println(dog.eat()+"骨头,憨狗般"+dog.sleep());

    }
}
class Animal2G extends Animal
{
    String  eat(){
    return species+"吃";
}
    String  sleep(){
    return species+"睡着了";
}
    Animal2G(String species, String sex) {
        super(species, sex);
    }
}