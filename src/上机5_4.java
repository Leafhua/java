import java.lang.reflect.Array;
import java.util.Arrays;

public class 上机5_4 {
    public static void main(String[] args) {
        int a[][]=new int[4][5];
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <5 ; j++) {
                a[i][j]= (int)(Math.random()*100);
                System.out.println("a["+i+"]["+j+"]="+a[i][j]);
            }
        }
       /*for (int i = 0; i <4 ; i++) {
            Arrays.sort(a[i]);
        }*/
        int max=a[0][0],min=a[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <5 ; j++) {
                if (a[i][j]>max)
                    max=a[i][j];
                if (a[i][j]<min)
                    min=a[i][j];
            }
        }
        System.out.println("矩阵中最大值为："+max);
        System.out.println("矩阵中最小值为："+min);

    }
}
