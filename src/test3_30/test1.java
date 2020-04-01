package test3_30;

public class test1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i <5 ; i++) {
            System.out.print(a[i]);
        }
        try {
            System.out.println("字符串索引越界异常");
            String str = args[0];
            System.out.println("第四个字符为" + str.charAt(3));
            int aa = Integer.parseInt(args[0]);
            System.out.println("平方为" + aa * aa);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
