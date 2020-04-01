import java.util.Scanner;

public class 上机4_7 {
    public static void main(String[] args) {
        int a,count,i;
        Scanner reader = new Scanner(System.in);
        for (;;) {
            System.out.println("输入一个整数");
            a=reader.nextInt();
            for ( i=2,count=1; i <=a/2 ;i++ ) {
                if(a%i==0)
                    count+=i;
            }
            if (count==a)
                System.out.println("此数为完全数");
            else
                System.out.println("此数不是完全数");

        }
    }
}
