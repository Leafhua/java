package day9;

public class 笔记本 {
    public static void main(String[] args) {
        laptop a = new laptop();
        laptopG2 b = new laptopG2();
        a.LOL();
        b.LOL();
        b.assassin();
    }
}
class laptop{
    void LOL(){
        System.out.println("玩LOL");
    }
}
class laptopG2 extends laptop
{
    void assassin(){
        System.out.println("玩刺客信条");
    }
}