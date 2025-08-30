package RamanaSirQuestions.Arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _40SumOfNumbers {
    public static void main(String[] args) {
        String s="acb243d10";
        int sum=0;
        Pattern p=Pattern.compile("\\d+");
        Matcher m=p.matcher(s);
        while (m.find()){
            String num=m.group();
            sum+=Integer.parseInt(num);
        }
        System.out.println(sum);
    }
}
