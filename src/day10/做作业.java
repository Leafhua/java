package day10;

import java.util.Scanner;

public class 做作业 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        a a = new a("瓜皮");
        b b = new b("鸹貔");
        a.studyMethod();
        a.doWork();
        b.studyMethod();
        b.doWork();
    }
}

abstract class Student
{
       String name;
       abstract void studyMethod();
        void doWork()
        {
            System.out.println(name+"做作业");
        }

    public Student(String name) {
        this.name = name;
    }
}
class a extends Student
{
    public a(String name) {
        super(name);
    }

    @Override
    void studyMethod() {
        System.out.println("睡觉学习");
    }
}
class b extends Student
{
    public b(String name) {
        super(name);
    }
    @Override
    void studyMethod() {
        System.out.println("看电视学习");
    }
}
