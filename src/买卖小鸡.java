public class 买卖小鸡 {
    public static void main(String[] args) {
        int money=100;
        for (int i = 0; i <money ; i++) {
            if (i%3==0){
                for (int j = 0; j <100-i ; j++) {
                    if(i/3+3*j+(100-i-j)*5==100){
                        System.out.println("小鸡有"+i+"母鸡有"+j+"公鸡有"+(100-i-j));
                    }
                }
            }
        }


    }
}
