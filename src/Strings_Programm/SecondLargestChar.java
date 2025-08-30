package Strings_Programm;

public class SecondLargestChar {
    public static void main(String[] args) {
        String s1="jjjjjjjjavvvvvaadev";
        int max=0;
        char maxChar='\u0000';
        int max_2=0;
        char maxChar_2='\u0000';

        while(s1.length()!=0){
            char ch=s1.charAt(0);
            String s2=s1.replace(ch+"","");
            int count=s1.length()-s2.length();
            if(count>max){
                max_2=max;
                maxChar_2=maxChar;
                max=count;
                maxChar=ch;

            } else if (count>max_2 && count!=max) {
                maxChar_2=ch;
                max_2=count;

            }
            s1=s2;
        }
        System.out.println(maxChar+"="+max);
        System.out.println(maxChar_2+"="+max_2);
    }
}
