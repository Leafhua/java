package day7;

import java.util.Scanner;

public class 动物 {
    public static void main(String[] args) {
        dog1 d = new dog1();
        cat c = new cat();
        Scanner reader = new Scanner(System.in);
        System.out.println("小狗年龄");
        d.setAge(reader.nextInt());
        System.out.println("小狗品种");
        d.setSpecies(reader.next());
        System.out.println("小狗性别");
        d.setGender(reader.next());
        System.out.println("小猫年龄");
        c.setAge(reader.nextInt());
        System.out.println("小猫品种");
        c.setSpecies(reader.next());
        System.out.println("小猫性别");
        c.setGender(reader.next());
        System.out.println("小狗信息"+d.toString());
        System.out.println("小猫信息"+c.toString());

    }
}
class Animal{
    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String Species,Gender;
    int age;
    void eat(){
        System.out.println(Species+"吃饭中");
    }
    void sleep(){
        System.out.println(Species+"睡觉中");
    }
}
class cat extends Animal{
    @Override
    public String toString() {
        return "cat{" +
                "Species='" + Species + '\'' +
                ", Gender='" + Gender + '\'' +
                ", age=" + age +
                '}';
    }

    void meow(){
        System.out.println("喵喵喵");
    }
}
class dog1 extends Animal{
    void bark(){
        System.out.println("汪汪汪");
    }

    @Override
    public String toString() {
        return "dog1{" +
                "Species='" + Species + '\'' +
                ", Gender='" + Gender + '\'' +
                ", age=" + age +
                '}';
    }
}