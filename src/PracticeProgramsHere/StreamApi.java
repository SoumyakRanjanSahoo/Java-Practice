package PracticeProgramsHere;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        String s="bangalore is a bangalore is is ";
        String[]str=s.split(" ");
        Arrays.stream(str).collect(Collectors.groupingBy(c->c,Collectors.counting())).forEach((ch,i)-> System.out.println(ch+"="+i));

    }
}
