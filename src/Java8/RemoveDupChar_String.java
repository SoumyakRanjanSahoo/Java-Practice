package Java8;

public class RemoveDupChar_String {
    static String res="";
    public static void main(String[] args) {
        String s="javadev";
        s.chars().distinct().forEach(i->res+=(char)i);
        System.out.println(res);
    }
}
