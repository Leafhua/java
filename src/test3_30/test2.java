package test3_30;

public class test2 {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            for (int i = 0; i < args.length; i++) {
                a[i] = Integer.parseInt(args[i]);
            }
            for (int i = 0; i < args.length; i++) {
                System.out.print(a[i]+"\t");
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("请输入整数");
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println(e.getMessage());
            System.out.println("数组越界");
        }

    }
}
