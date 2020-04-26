package day10;

public class 乐器 {
    public static void main(String[] args) {
         piano a = new piano();
         violin b = new violin();
    }
}
interface Instrument
{
    void play();
}
class piano implements Instrument
{
    public piano() {
        System.out.println("我是一架钢琴");
        play();
    }

    @Override
    public void play() {
        System.out.println("钢琴声~~~~~~~~");
    }
}
class violin implements Instrument
{
    public violin() {
        System.out.println("我是小提琴");
        play();
    }

    @Override
    public void play() {
        System.out.println("小提琴声~~~~~~~");
    }
}