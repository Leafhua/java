package day7;

import java.util.Scanner;

public class 描述小狗 {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("输入小狗的品种");
        dog d =new dog();
        d.setVariety(reader.next());
        System.out.println("输入小狗年龄");
        d.setAge(reader.nextInt());
        System.out.println("输入小狗性别");
        d.setGender(reader.next());
        System.out.println(d.getAge());
        System.out.println(d.getGender());
        System.out.println(d.getVariety());
        d.eat();
        d.watchDoor();
    }
}
class dog{
    int age;
    String variety,gender;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void eat(){
        System.out.println("小狗吃饭中");
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    void watchDoor(){
        System.out.println("小狗看门中");
    }
}
