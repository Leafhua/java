package test;

public class 实验6_4 {
    public static void main(String[] args) {
        MyPlus p =new MyPlus();
        System.out.println(p.plus(1,2) );
        System.out.println(p.plus(1,2,3));
        System.out.println(p.plus(1,2,3,4));

    }
}
class MyPlus
{


    public int plus(int a , int b )
    {
        int s ;
        s = a + b;
        return s;
    }
    public int plus(int a , int b ,int c)
    {
        int s ;
        s= c + plus(a, b);
        return s;
    }
    public int plus(int a,int b,int c,int d)
    {
        int s;
        s=d + plus(a,b,c);
        return s;
    }
}
