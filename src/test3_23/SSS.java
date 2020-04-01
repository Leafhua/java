package test3_23;

public class SSS {
    public static void main(String[] args) {
        bogo(new Extension());
    }
    static void bogo(Base b){
        b.add(8);
        b.print();
    }
}
class Base{
    int i ;
    Base(){
        add(1);
        System.out.println("Base :"+i);
    }
    void add (int v){
        i+=v;
        System.out.println("Base.add :"+i);
    }
    void print(){
        System.out.println(i);
    }
}
class Extension extends Base{
    Extension(){
        add(2);
        System.out.println("EXtension :"+i);
    }
    void add(int v){
        i+=v*2;
        System.out.println("EXtension.add :"+i);
    }
}