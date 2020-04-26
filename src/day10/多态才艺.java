package day10;

import java.util.Scanner;

public class 多态才艺 {
    public static void main(String[] args) {
        Contestant a = new Contestant("蔡徐坤","男",18);
        Scanner reader = new Scanner(System.in);
        a.message();
        a.talent(reader.next());
        a.display();

    }
}
class people{
    String name,sex;
    int age;
    void message(){
        System.out.println("name:"+name+"sex:"+sex+"age:"+age);
    }
}
class Contestant extends people
{
    String skill;
    Contestant(String name,String sex,int age)
    {
        this.name=name;
        this.sex = sex;
        this.age = age;
    }
    void talent(String skill)
    {
        this.skill = skill;
    }
    void display()
    {
        System.out.println("全名制作人大家好，我是"+age+"岁的"+sex+"练习生"+name+"喜欢"+skill);
    }
}