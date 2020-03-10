package src.com.homework3;

public class Task_19 {
    public static void main(String[] args) {
        String str = "   Базовым классом для работы со  строковыми данными   является String  ";
        str = str.trim();
        int count = 0;

        String[] s = str.split(" ");

//        for (int i = 0; i < s.length; i++) {
//            System.out.println(s[i]);
//        }
        for (int i = 0; i <s.length ; i++) {
            if(!"".equals(s[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}

