package Java8;

import java.util.Arrays;
import java.util.List;

public class RemoveDup_Collection {
    public static void main(String[] args) {
        List<Integer>l= Arrays.asList(9,8,98,7,2,1,2);
        List<Integer>list=l.stream().distinct().toList();
        System.out.println(list);
    }
}
