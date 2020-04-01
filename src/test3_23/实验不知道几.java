package test3_23;

public class 实验不知道几 {
    public static void main(String[] args) {
        Student s = new Student(10001,"瓜皮",'男',90,100,90);
        System.out.println( s.toString());

    }
}
class Person{
    String name;
    char sex;
    int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
class Student extends Person{
    long number;
    int math,chinese,english;
    Student(long number, String name,char sex, int math , int chinese ,int english ){
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.math = math;
        this.chinese = chinese;
        this.english = english;
    }

    public double aver(){
        return (double) (math+chinese+english)/3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", number=" + number +
                ", aver=" + aver()+
                '}';
    }
}