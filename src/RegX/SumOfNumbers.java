package RegX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNumbers {
    public static void main(String[] args) {
        String s="aba123AbCd";
        String exp="[0-9]";
        Pattern p= Pattern.compile(exp);
        Matcher m=p.matcher(s);
        int Sum=0;
        while (m.find())
            Sum+=Integer.parseInt(m.group());

        System.out.println(Sum);
    }

}
