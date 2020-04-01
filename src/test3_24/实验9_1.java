package test3_24;

public class 实验9_1 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        try {
            y = 3 / x;
        } catch (Exception e){
            System.out.println("程序运行时发生异常");
        }
        System.out.println("程序结束");
    }
}

