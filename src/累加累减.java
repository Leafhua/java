public class 累加累减 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <= 51; i++) {
            if(i%2==0)
                sum-=i*2-1;
            else
                sum+=i*2-1;
        }
        System.out.println(sum);
    }
}
