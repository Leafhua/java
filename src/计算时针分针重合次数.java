public class 计算时针分针重合次数 {
    public static void main(String[] args) {
        int flg=0;
        for (double i = 0; i <=12*60*60 ; i++) {
            if((i/120)%360==(i*0.1)%360&&(i*0.1)%360==(i*6)%360&&(i/120)%360==(i*6)%360){
                flg++;
                System.out.println((int)i/3600+":"+(int)(i/60)%60+":"+(int)i%60);
            }

        }
        System.out.println(flg);
    }
}
