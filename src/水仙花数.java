public class 水仙花数 {
    public static void main(String[] args) {
        System.out.println("100~1000以内的水仙花数");
        for (int i = 100,k=0;i <999 ; i++) {
            if(Math.pow(i%10,3)+Math.pow(i/10%10,3)+Math.pow(i/100%10,3)==i) {
                k++;
                System.out.println("第"+k+"个水仙花数是："+i+" ");
            }
        }
    }
}
