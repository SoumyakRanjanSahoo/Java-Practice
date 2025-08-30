package Java8;

import java.util.Arrays;
import java.util.List;

public class MaleFeameCount_HCL {
    public static void main(String[] args) {
        Emp e1=new Emp("Raj", 20,'M');
        Emp e2=new Emp("Rani", 24,'F');
        Emp e3=new Emp("Soumyak", 21,'M');
        Emp e4=new Emp("Leela",  20,'F');
        Emp e5=new Emp("JD", 19,'M');
        Emp[]e={e1,e2,e3,e4,e5};
        List<Emp>l= Arrays.asList(e);
        Long f=l.stream().filter(i->i.gender=='F').count();
        System.out.println("Female Count:"+f);
        System.out.println("Male Count:"+(e.length-f));
    }
}
