package test4_28;

public class test13_4 {
    public static Calculable cal (char opr)
    {
        Calculable result;
        if (opr =='+')
        {
            result = new Calculable() {
                @Override
                public int calInt(int a, int b) {
                    return a+b;
                }
            };
        }
        else
        {
            result = new Calculable() {
                @Override
                public int calInt(int a, int b) {
                    return a-b;
                }
            };
        }
        return result;
    }

    public static void main(String[] args) {
        int n1 = 10, n2 = 5;
        Calculable f1 = cal('+');
        System.out.println(n1+"+"+n2+"="+f1.calInt(n1,n2));
        Calculable f2 = cal('-');
        System.out.println(n1+"-"+n2+"="+f2.calInt(n1,n2));

    }
}
interface Calculable
{
    int calInt(int a,int b);
}