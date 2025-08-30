package DSA;

public class ArrayListUserProg {
    public static void main(String[] args) {
        ArrayListImple l=new ArrayListImple();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        for (int i=0;i<l.size();i++)
            System.out.println(l.get(i));

    }
}
