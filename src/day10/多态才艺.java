package day10;

public class 多态才艺 {
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

}