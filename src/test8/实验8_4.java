package test8;

public class 实验8_4 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",16);
        s1.introduce();
        s1.setScore(80,90,80);
        s1.average();
    }
}

interface Achievement {
    float average();
}

class Person {
    String name;
    int age;

    public Person(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    public void introduce() {
        System.out.println("你好，我是" + name + "今年" + age + "岁");
    }
}

class Student extends Person implements Achievement {
    int chinese;
    int math;
    int english;

    public Student(String newName, int newAge) {
        super(newName, newAge);
    }

    public void setScore(int c, int m, int e)
    {
        chinese = c;
        math = m;
        english = e;
    }
    public float average()
    {
        return (chinese+english+math)/3;
    }
}

