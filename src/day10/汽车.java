package day10;

public class 汽车 {
    public static void main(String[] args) {
        car a = new car();
        a.fire();
        a.drive();

    }
}
interface carRequest
{
    void drive();
    void fire();
}
class car implements carRequest
{
    @Override
    public void drive() {
        System.out.println("开80迈");
    }

    @Override
    public void fire() {
        System.out.println("点火！！！");
    }

    public car() {
        System.out.println("生产汽车！！");
    }
}