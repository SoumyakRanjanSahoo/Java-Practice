package NumberPrograms;

public class ArmStrongNo {
    static int count = 0;

    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        System.out.println(isArmstrong(num, 0, original));

    }

    public static boolean isArmstrong(int num, int sum, int original) {
        if (num == 0) return (sum == original);

        sum += power(num % 10, count);
        return isArmstrong(num /= 10, sum, original);
    }

    public static int power(int n, int power) {
        if (power == 0) return 1;
        return n * power(n, power - 1);
    }
}
