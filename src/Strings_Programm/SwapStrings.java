package Strings_Programm;

public class SwapStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before Swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // Swapping logic without a third variable
        str1 = str1 + str2; // Concatenate both strings
        str2 = str1.substring(0, str1.length() - str2.length()); // Extract the first part (original str1)
        str1 = str1.substring(str2.length()); // Extract the second part (original str2)

        System.out.println("\n After Swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }

}
