package src.com.homework3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Task_21 {

    public static final int STRINGSIZE = 100000;

    public static void main(String[] args) {
        // первый способ
        String[] str = {"мы", "сложили", "эти", "строки"};
        String s = "";
        System.out.println("Простое сложение строк");
        long start  = System.nanoTime();

        for (int i = 0; i < STRINGSIZE; i++) {
            s = s + str[i%str.length] ;
        }
        long end = System.nanoTime();
        System.out.println(s);
        System.out.println("Операция выполнилась за " + (end - start)/1000000 + " миллисекунд");



// второй способ
        StringBuilder st = new StringBuilder();
        System.out.println("StringBuilder");
        start  = System.nanoTime();
        for (int i = 0; i < STRINGSIZE; i++) {
            st.append(str[i%str.length] );
        }
        end = System.nanoTime();

        System.out.println(st);
        System.out.println("Операция выполнилась за " + (end - start)/1000000 + " миллисекунд");
// третий способ
        StringBuffer st2 = new StringBuffer();
        System.out.println("StringBuffer");
        start  = System.nanoTime();
        for (int i = 0; i < STRINGSIZE; i++) {
            st2.append(str[i%str.length]  );
        }
        end = System.nanoTime();

        System.out.println(st2);
        System.out.println("Операция выполнилась за " + (end - start)/1000000 + " миллисекунд");
    }
}
