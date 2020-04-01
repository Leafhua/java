import java.util.Scanner;

public class 上机5_8 {
    public static void main(String[] args) {
        String str,str1;
        int a,b;
        Scanner reader = new Scanner(System.in);
        for (;;){
            System.out.println("请输入一个字符串：");
            str=reader.next();
            System.out.println("请输入截取位置：");
            a=reader.nextInt()-1;
            System.out.println("请输入截取长度：");
            b=reader.nextInt();
            System.out.println(str.substring(a,b));
        }
    }
}
