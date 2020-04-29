package test4_27;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class test13_2 {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("java.lang.String");
            Method[] mtds = clazz.getMethods();
            for (Method m : mtds)
            {
                int mod = m.getModifiers();
                System.out.print(Modifier.toString(mod));
                Class retType = m.getReturnType();
                System.out.print(" "+retType.getName());
                System.out.print(" "+m.getName()+"(");
                Class[] paramType = m.getParameterTypes();
                for (int i = 0; i <paramType.length ; i++) {
                    if (i>0) System.out.print(",");
                    System.out.print(paramType[i].getName());
                }
                System.out.println(");");
            }
        }

        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
