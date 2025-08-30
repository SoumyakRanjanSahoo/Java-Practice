package RegX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndianMobileNoValidation {
    public static void main(String[] args) {
        String s="7789071038";
        String exp="[9876][0-9]{9}";
        Pattern p= Pattern.compile(exp);
        Matcher m=p.matcher(s);
        if (m.matches()){
            System.out.println("Valid Mobile Number");
        }
        else {
            System.out.println("Invalid Mobile Number");
        }
    }
}
