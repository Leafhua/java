package day9;

public class 动物 {
    public static void main(String[] args) {
        cat a = new cat();
        dog b = new dog();
        a.eat();a.sleep();
        b.eat();a.sleep();

    }
}
class Animal{
    void eat()
    {
        System.out.println("动物吃饭");
    }
    void sleep(){
        System.out.println("动物睡觉");
    }
}
class cat extends Animal{
    @Override
    void eat() {
        System.out.println("小猫吃小鱼干");
    }
}
class dog extends Animal{
    @Override
    void eat() {
        System.out.println("小狗吃骨头");
    }
}