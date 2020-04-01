import java.util.Scanner;

public class 工资计算 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        for (; ; ) {
            System.out.println("输入你的工资");
            double salary = reader.nextInt();
            if (salary > 100000 + 3500) {
                salary = salary - ((salary - 3500) * 0.45 - 15375);
                System.out.println("薪水为" + salary);
            } else if (salary > 80000 + 3500) {
                salary = salary - ((salary - 3500) * 0.4 - 10375);
                System.out.println("薪水为" + salary);
            } else if (salary > 60000 + 3500) {
                salary = salary - ((salary - 3500) * 0.35 - 6375);
                System.out.println("薪水为" + salary);
            } else if (salary > 40000 + 3500) {
                salary = salary - ((salary - 3500) * 0.3 - 3375);
                System.out.println("薪水为" + salary);
            } else if (salary > 20000 + 3500) {
                salary = salary - ((salary - 3500) * 0.25 - 1375);
                System.out.println("薪水为" + salary);
            } else if (salary > 5000 + 3500) {
                salary = salary - ((salary - 3500) * 0.2 - 375);
                System.out.println("薪水为" + salary);
            } else if (salary > 2000 + 3500) {
                salary = salary - ((salary - 3500) * 0.15 - 125);
                System.out.println("薪水为" + salary);
            } else if (salary > 500 + 3500) {
                salary = salary - ((salary - 3500) * 0.1 - 25);
                System.out.println("薪水为" + salary);
            } else if (salary > 3500) {
                salary = salary - ((salary - 3500) * 0.05);
                System.out.println("薪水为" + salary);
            } else {
                System.out.println("薪水为" + salary);
            }
        }
    }
}
