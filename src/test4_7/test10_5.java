package test4_7;

import java.io.*;

public class test10_5 {
    public static void main(String[] args) throws IOException {
        if(args.length==0){
            System.out.println("没有需要创建的文件");
            System.exit(1);
        }
        for (int i = 0; i <args.length ; i++) {
            new File(args[i]).createNewFile();
        }
    }
}
