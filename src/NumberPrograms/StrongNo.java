package NumberPrograms;

public class StrongNo {
    public static void main(String[] args) {
        int num = 145;
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        if (temp == sum) System.out.println("strong");
        else System.out.println("no");

    }

    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
