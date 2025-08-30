package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate {
    public static void main(String[] args) {
        int[]a={6,7,8,9,6,7,8,9};
        Set<Integer>s=new LinkedHashSet<Integer>();
        for (int n:a)s.add(n);
        System.out.println(s);
    }
}
