package Java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class OccuranceChar_String {
    public static void main(String[] args) {
        String s="javdev";
        Map<Character,Long>m=s.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(c->c,()->new LinkedHashMap<>(),Collectors.counting()));
        m.forEach((ch,i)-> System.out.println(ch+"="+i));
    }
}
