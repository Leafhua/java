import java.util.Scanner;

public class 上机3_2 {
    public static void main(String[] args) {
        int a = -1;
        Scanner reader = new Scanner(System.in);
        System.out.println("从键盘输入一个0~6的整数：");
        a = reader.nextInt();
        switch (a) {
            case 0:
                System.out.println("今天是星期一");
                break;
            case 1:
                System.out.println("今天是星期二");
                break;
            case 2:
                System.out.println("今天是星期三");
                break;
            case 3:
                System.out.println("今天是星期四");
                break;
            case 4:
                System.out.println("今天是星期五");
                break;
            case 5:
                System.out.println("今天是星期六");
                break;
            case 6:
                System.out.println("今天是星期日");
                break;
            default:
                System.out.println("输入错误");
                System.out.println(+a);
                break;


        }

    }
}
