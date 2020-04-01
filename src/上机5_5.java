public class 上机5_5 {
    public static void main(String[] args) {
        int a[],temp;
        a=new int[8];
        for (int i = 0; i < 8; i++) {
            a[i]=(int)(Math.random()*100);
            System.out.println("a["+i+"]="+a[i]);
        }
        for (int j = 0; j <8; j++) {
            for (int i = 0; i < 7; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i <8 ; i++) {
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}
