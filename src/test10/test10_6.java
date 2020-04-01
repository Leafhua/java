package test10;

import java.io.*;

public class test10_6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin;
        FileOutputStream fout;
        DataInputStream din;
        DataOutputStream dout;
        File f =new File("baseData.txt");
        try{
            f.createNewFile();
        } catch (IOException e) {

        }
        try {
            fout =new FileOutputStream(f);
            dout = new DataOutputStream(fout);
            dout.writeInt(10);
            dout.writeLong(12345);
            dout.writeFloat(3.1415926f);
            dout.writeDouble(987654321.123);
            dout.writeBoolean(true);
            dout.close();
        }
        catch (IOException e){

        }
        try {
            fin =new FileInputStream(f);
            din = new DataInputStream(fin);
            System.out.println(din.readInt());
            System.out.println(din.readLong());
            System.out.println(din.readFloat());
            System.out.println(din.readDouble());
            System.out.println(din.readBoolean());
            din.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到！！");
        }
        catch (IOException e){}

    }
}
