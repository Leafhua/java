package test10;
import java.io.*;
public class test10_1 {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin;
        fin = new FileInputStream("src/test10/myTest.txt");
        do{
            i = fin.read();
            if (i !=-1 )
                System.out.print((char)i);
        }while (i!=-1);
        fin.close();

    }
}
