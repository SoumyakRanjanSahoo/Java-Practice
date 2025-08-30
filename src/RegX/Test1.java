package RegX;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
//        String s="a1bc2ab3cd5e7c245";
//        String exp="[abc][0-9]";-------

//        String s="ababcdabcad162#2gdh";
//        String exp=".";
//        String exp="a..a";

//        String s="abc.d.e.f.t";
//        String exp="[.]";

        String s="abbbaaddefedd";
        String exp="([a-z]) ([a-z])\\1";


        Pattern p= Pattern.compile(exp);
        Matcher m=p.matcher(s);
//        System.out.println(m.find());
//        System.out.println(m.find());
//        System.out.println(m.find());
//        System.out.println(m.find());
//        System.out.println(m.find());



//          int count=0;
//          while (m.find())
//              count++;
//        System.out.println(exp+"="+count);


//        while (m.find()){
//            System.out.println(m.start());
//            System.out.println(m.end());
//            System.out.println(m.group());
//        }


        while (m.find())
            System.out.println(m.group());



    }
}
