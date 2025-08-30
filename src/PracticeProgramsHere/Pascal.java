package PracticeProgramsHere;
@FunctionalInterface
interface prime{
    public  boolean prime(int a);
}

class Test {
    public static void main(String[] args) {
        prime p=a-> {
            if (a<=1)return false;
            for (int i = 2; i < a/2; i++) {
                if (a%i==0)
                    return false;
            }
            return true;
        };
        System.out.println(p.prime(7));

    }
}