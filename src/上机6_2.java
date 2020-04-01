public class 上机6_2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("张三");
        Student S3 = new Student("李四",15);
    }
}

class Student {
    String name;
    int age;

    public Student() {
        System.out.println("Student()构造方法被调用");
    }

    public Student(String newName) {
        this.name = newName;
        System.out.println("Student(String newName)构造方法被调用");
    }

    public Student(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
        System.out.println("Student(String newName , int newAge)构造方法被调用");
    }

}
