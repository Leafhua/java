package test4_13;

public class 课后编程题 {
    public static void main(String[] args) {
        Thread1 a = new Thread1();
        Thread2 b = new Thread2();
        Thread3 c = new Thread3();
        a.start();
        try {
            a.join();
        } catch (InterruptedException e) {

        }
        b.start();
        c.start();
    }
}
class Thread1 extends Thread
{
    @Override
    public void run() {
        try {
            for (int i = 0;i<6;i++){
                System.out.println('a');
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
        }

    }
}
class Thread2 extends Thread
{
    @Override
    public void run() {
        try {
            for (int i = 0;i<8;i++){
                System.out.println('b');
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
        }

    }
}
class Thread3 extends Thread
{
    @Override
    public void run() {
        try {
            for (int i = 1;i<11;i++){
                System.out.println(i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
        }

    }
}