package RegX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndianMobileNo {
    public static void main(String[] args) {
        String s="kjhgfghjhg985324035edfggvvb778907103857sf bbn";
        String exp="[9876][0-9]{9}";
        Pattern p= Pattern.compile(exp);
        Matcher m=p.matcher(s);
       while (m.find()){
           System.out.println(m.group());
       }
    }
}
