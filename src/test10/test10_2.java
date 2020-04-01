package test10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test10_2 {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin;
        FileOutputStream fout;
        fin = new FileInputStream("src/test10/myFile.txt");
        fout = new FileOutputStream("src/test10/yourFile.txt");
        do {
            i = fin.read();
            if (i!=-1)
                fout.write(i);
        }while (i!=-1);
        fin.close();
        fout.close();
        System.out.println("myFile.txt内容已经被复制到yourFile.txt文件中");
    }
}
