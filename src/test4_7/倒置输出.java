package test4_7;

import java.io.*;

public class 倒置输出 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile f = new RandomAccessFile("RandomFile.txt","r");
        for (int i = (int) (f.length()-1); i>=0 ; i--) {
            f.seek(i);
            char c ;
            c = (char)f.read();
            System.out.print(c);

        }

        }
}
