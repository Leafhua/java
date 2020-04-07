package test4_7;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args)throws IOException {
        FileWriter fw = new FileWriter("test.txt");
        String str1 = "广东金融学院\n";
        String str2 = "欢迎使用java！";
        fw.write(str1);
        fw.write(str2);
        fw.close();
        System.out.println("内容已写入到文件test.txt中");
    }
}
