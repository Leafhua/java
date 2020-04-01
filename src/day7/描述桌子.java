package day7;

import java.util.Scanner;

public class 描述桌子 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        table t1 =new table();
        System.out.println("输入材质");
        t1.setMaterial(reader.next());
        System.out.println("输入高度");
        t1.setHigh(reader.nextInt());
        System.out.println("输入形状");
        t1.setShape(reader.next());
        System.out.println(t1.getHigh());
        System.out.println(t1.getMaterial());
        System.out.println(t1.getShape());
    }
}
class table{
    String material,shape;
    int high;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String  shape) {
        this.shape = shape;
    }
}