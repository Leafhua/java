package test4_26;

public class test13_1 {
    String name;int age;

    @Override
    public String toString() {
        return "姓名:"+this.name+"年龄："+this.age;
    }
    @Deprecated
    public void show(String name)
    {
        System.out.println(name);
    }

    public static void main(String[] args) {
        test13_1 p = new test13_1();
        p.show("张三");
    }

}
@FunctionalInterface
interface StringFunc
{
    public String func(String s);
}

