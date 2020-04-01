package day9;

public class 飞机 {
    public static void main(String[] args) {
        airPlan a = new airPlan();
        fighter b = new fighter();
        TransportAircraft c = new TransportAircraft();
        a.fly();
        b.fly();
        b.attack();
        c.fly();
        c.send();
    }
}
class airPlan{
    void fly(){
        System.out.println("飞行");
    }
}
class fighter extends airPlan
{
    void attack(){
        System.out.println("飞机攻击 ");
    }
}
class TransportAircraft extends airPlan
{
    void send(){
        System.out.println("飞机运送物资");
    }
}