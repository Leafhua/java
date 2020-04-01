package test3_30;
class AaaException extends Exception{
    
}
class BbbException extends Exception{
    
}
public class 实验9_5 {
    public static void main(String[] args) {
        int x = 1;
        try {
            if (x>0) {
                throw new  AaaException();
            }
            else {
                throw new BbbException();
            }
        }
        catch (AaaException e){
            System.out.println("执行aaa异常处理程序");
        }
        catch (BbbException e ){
            System.out.println("执行bbb异常处理程序");
        }
    }

}
