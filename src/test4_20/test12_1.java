package test4_20;

public class test12_1 <T>{
    private T[] array;

    public void setArray(T[] array) {
        this.array = array;
    }
    public T[] getArray() {
        return array;
    }

    public static void main(String[] args) {
        test12_1<String> a = new test12_1<String>();
        String beauty[] ={"西施","王昭君","貂蝉","杨贵妃"};
        a.setArray(beauty);
        for (int i = 0; i <a.getArray().length ; i++) {
            System.out.print(a.getArray()[i]+" ");
        }
    }
}
