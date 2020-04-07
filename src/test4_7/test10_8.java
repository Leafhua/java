package test4_7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class test10_8 {
    public static void main(String[] args) {
        File f =new File("RandomFile.txt");
        try {
            f.createNewFile();
        }
        catch (IOException e){
            System.out.println(e);
        }
        String str = "abcdefghijklmnopqrstuvwxyz";
        try {
            FileWriter fw = new FileWriter(f);
            fw.write(str);
            fw.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
        int a = -1;
        Scanner reader = new Scanner(System.in);
        while (a<0||a>25)
        {
            System.out.println("从键盘输入一个0~25的整数：");
            a = reader.nextInt();
        }
        try {
            RandomAccessFile inFile = new RandomAccessFile("RandomFile.txt","r");
            inFile.seek(a);
            char c = (char) inFile.read();
            inFile.close();
            System.out.println("RandomFile.txt文件中第"+a+"个字符是"+c);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
