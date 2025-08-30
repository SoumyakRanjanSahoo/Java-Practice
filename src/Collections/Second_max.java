package Collections;

import java.util.*;

public class Second_max {
    public static void main(String[] args) {
        int[]a={6,7,2,3,4,5,8};
        List<Integer>l=new ArrayList<Integer>();
        for (int n:a)
            l.add(n);
        Collections.sort(l);
        Set<Integer>s=new LinkedHashSet<Integer>();
        for (int n:l)
            s.add(n);
        System.out.println(l);
        System.out.println(s);
        int max1=0;
        int max2=0;
        Iterator<Integer>i=s.iterator();
        while (i.hasNext()){
            max2=max1;
            max1=i.next();
        }
        System.out.println(max2);
    }
}
