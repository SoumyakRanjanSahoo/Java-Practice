package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Roman_number {
    public static void main(String[] args) {
        int num=1225;
        System.out.println(convert(num));
    }
    public static String convert(int n){
        String res="";
        Map<Integer,String> m=new LinkedHashMap<>();
        m.put(1,"I");
        m.put(4,"IV");
        m.put(5,"V");
        m.put(9,"IX");
        m.put(10,"X");
        m.put(40,"XL");
        m.put(50,"L");
        m.put(90,"XC");
        m.put(100,"C");
        m.put(400,"CD");
        m.put(500,"D");
        m.put(900,"CM");
        m.put(1000,"M");
        int[]num={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for (int value:num){
            while (n>=value){
                res+=m.get(value);
                n-=value;
            }
        }
        return res;
    }
}
