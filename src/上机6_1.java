

public class 上机6_1 {
    public static void main(String[] args) {
        Person s1 = new Person();
        s1.name="张三";
        if (s1.setAge(25)){
            System.out.println("s1的姓名为："+s1.name+"年龄为:"+s1.getAge());
        }
        else System.out.println("年龄错误");
    }
}
class Person
{
    String name;
    private int age;

    public boolean setAge(int age) {
        if (age>=5&age<=20) {
            this.age = age;
        return true;
        }
        else return false;
    }

    public int getAge() {
        return age;
    }
}