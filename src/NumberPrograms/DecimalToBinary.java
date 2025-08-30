package NumberPrograms;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal=9;
        System.out.println(binary(decimal));

    }
    public static String binary(int decimal){
        if (decimal==0)
            return "0";
        if (decimal==1)
            return "1";
        return binary(decimal/2)+(decimal%2);
    }
}
