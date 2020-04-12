package test4_7;

import java.io.*;

public class test8_55 {
    static void dir(File f){
        if (f.isDirectory()) {
            File ff[] = f.listFiles();
            for (File i:ff){
                dir(i);
                if(i.getName().lastIndexOf(".class")!=-1){
                    System.out.println(i.getAbsolutePath());
                    System.out.println(i.getName());
                }

            }
        }
    }

    public static void main(String[] args) {
        File f = new File("src");
        dir(f);

    }
}
