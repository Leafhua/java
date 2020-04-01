import java.util.Scanner;

public class 求最小公倍数与最大公约数 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n, m;
        System.out.println("输入M");
        m = reader.nextInt();
        System.out.println("输入n");
        n = reader.nextInt();
        int max = m > n ? m : n;
        for (int i = max; ; i--) {
            if (n % i == 0 & m % i == 0) {
                System.out.println("最大公约数为" + i);
                break;
            }
        }
        for (int i = max;   ; i++) {
            if(i%n==0&i%m==0){
                System.out.println("最小公倍数为"+i);
                break;
            }

        }
    }
}
