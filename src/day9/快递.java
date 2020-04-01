package day9;

public class 快递 {
    public static void main(String[] args) {
        ZT a = new ZT();
        SF b = new SF();
        a.sendGoods();
        a.eatFruit();
        b.sendGoods();
        b.throwRubbish();
    }
}
class Courier{
    void sendGoods(){
        System.out.println("运送包裹");
    }
}
class ZT extends Courier
{
    void eatFruit(){
        System.out.println("中通偷吃水果");
    }
}
class SF extends Courier
{
    void throwRubbish(){
        System.out.println("顺丰扔垃圾");
    }
}