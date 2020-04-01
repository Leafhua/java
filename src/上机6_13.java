import java.util.Scanner;

public class 上机6_13 {
    public static void main(String[] args) {
        int n, m;
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入m");
        m=reader.nextInt();
        System.out.println("请输入n");
        n=reader.nextInt();
        int a[][]=new int[m][n],sum[]=new int[n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                a[i][j]=(int)(Math.random()*100);
                sum[j]+=a[i][j];
            }
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        }
        for (int i = 0; i <n ; i++) {
            System.out.println("第"+(i+1)+"列和为"+sum[i]);
        }
    }
}