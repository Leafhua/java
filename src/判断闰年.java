import java.util.Scanner;

public class 判断闰年 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        for(;;) {
            System.out.println("今年是第几年？");
            int year = reader.nextInt();
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println("今年是闰年");
            } else if (year % 400 == 0) {
                System.out.println("今年是闰年");
            } else {
                System.out.println("今年不是闰年");
            }
        }
    }
}
