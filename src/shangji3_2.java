import java.util.Scanner;

public class shangji3_2 {
    public static void main(String[] args) {
        int a,b,c,max;
        Scanner reader =new Scanner(System.in);
        System.out.println("从键盘输入第一个整数");
        a=reader.nextInt();
        System.out.println("从键盘输入第二个整数");
        b=reader.nextInt();
        System.out.println("从键盘输入第三个整数");
        c=reader.nextInt();
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("最大的数是："+max);
        }
    }

