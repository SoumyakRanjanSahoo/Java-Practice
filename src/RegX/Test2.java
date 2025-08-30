package RegX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {
//        String s="abbbaaddefedd";
//        String exp="([a-z])([a-z])\\1";
//        String s="Ra\\ma\\na";
//        String exp="\\\\";
//        String s="abbababbbab";
//        String exp="ab{2,}";

//        String s="aabbacadabbbb";
//        String exp="ab{0,}";

//        String s="a2b54c2ed43";
//        String exp="[0-9]{2}";

        String s="a2b54c22d43";
        String exp="[a-z 0-9 ]{2}";
        Pattern p= Pattern.compile(exp);
        Matcher m=p.matcher(s);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
