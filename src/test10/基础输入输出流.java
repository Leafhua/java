package test10;

import java.io.IOException;

public class 基础输入输出流 {
    public static void main(String[] args) throws IOException {
        char a;
        System.out.println("请输入一个字符：");
        a = (char) System.in.read();
        System.out.println("该字符为："+a);
    }
}
