package test3_23;

public class 实验8_14 {
    public static void main(String[] args) {
        for (week d:week.values()){
            System.out.println("序号:"+d.ordinal()+"  星期"+d.name());
        }
    }
}
enum week
{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
