package DSA;

public class UserProgram {
    public static void main(String[] args) {
        HashSetImple a=new HashSetImple();
        a.add("my");
        a.add("name");
        a.add("is");
        a.add("Soumyak");
        a.add("Ranjan");
        a.add("Sahoo");
        a.display();
        System.out.println(a.isEmpty());
        System.out.println(a.size());
    }
}
