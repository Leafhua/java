package test3_17;

public class 意外作业 {
    public static void main(String[] args) {
        Student student = new Student("xiao wang", 20);
        student.talk();
        student.write();
        student.study();
    }
}

abstract class People {
    private String name;
    private int age;

    People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract void talk();
}

interface Study {
    int COURSENUM = 50;

    default void study() {
        System.out.println("学生需要学习" + COURSENUM + "门课程");
    }
}

interface Write {
    void write();
}

class Student extends People implements Study, Write {

    Student(String name, int age) {
        super(name, age);
    }

    @Override
    void talk() {
        System.out.println("我的名字叫" + this.getName() + "今年" + this.getAge() + "岁");
    }

    @Override
    public void write() {
        System.out.println("学生会写作业");
    }
}