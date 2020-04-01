import java.util.Scanner;

public class 打印菱形 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("输入对角线长");
        int s = reader.nextInt();
        for (int i = 1; i <= s; i++) {
            for (int j = 0; j < s - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");

            }
            System.out.print("\n");
        }
        for (int i = 1; i <= s; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");

            }
            for (int j = 0; j < s - i; j++) {
                System.out.print(" *");
            }

            System.out.print("\n");
        }
    }
}
