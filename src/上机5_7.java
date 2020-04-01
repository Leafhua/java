import java.util.Scanner;

public class 上机5_7 {
    public static void main(String[] args) {
        String str1, str2;
        Scanner reader = new Scanner(System.in);
        for(;;){
            System.out.println("请输入第一串字符：");
            str1=reader.next();
            System.out.println("请输入另一串字符：");
            str2=reader.next();
            if(str1.equals(str2))
                System.out.println("相等");
            else
                System.out.println("不相等");

        }
    }
}
