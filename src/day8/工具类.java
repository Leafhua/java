package day8;

import java.io.IOException;

public class 工具类 {
    public static void main(String[] args) throws IOException {
        System.out.println("输入数据");
        tools a = new tools(System.in.read());
        System.out.println("输出数据类型"+a.transform().getClass().getCanonicalName()+"数据为："+a.transform());

    }
}
class tools{
    int a;
    String  transform(){
//char自动转换成int类型，而每个字符都有所代码的ascii码值，'0'的ascii码值是48
    String a = this.a-48+"";
        return a;
    }

    public tools(int a) {
        this.a = a;
    }
}