package test8;
import java.io.*;
public class 实验8_1 {
    public static void main(String[] args) {
        char c =' ';
        System.out.println("请输入一个字符");
        try {
            c = (char)System.in.read();
        }catch (IOException s){

        }
        System.out.println("您输入的字符是"+c);
    }
}
