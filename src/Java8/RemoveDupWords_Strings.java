package Java8;

import java.util.Arrays;
import java.util.List;

public class RemoveDupWords_Strings {
    static String res="";
    public static void main(String[] args) {
        String s="Bangalore is a Bangalore";
        String[]str=s.split(" ");
        List<String >l= Arrays.asList(str);
        l.stream().distinct().forEach(i->res+=i+" ");
        System.out.println(res.trim());
    }
}
