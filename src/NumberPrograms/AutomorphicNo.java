package NumberPrograms;

public class AutomorphicNo {
    public static void main(String[] args) {
        int n=7;

    }
    public static boolean Automorphic(int n ,int sq){
        if (n==0) return true;
        if (n%10 != sq%10)
            return false;
         return Automorphic(n/10,sq/10);
    }
}
