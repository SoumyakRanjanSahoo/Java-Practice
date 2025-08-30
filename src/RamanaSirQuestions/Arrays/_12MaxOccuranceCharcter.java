package RamanaSirQuestions.Arrays;

public class _12MaxOccuranceCharcter {
    public static void main(String[] args) {
        String s1="rammana";
        int maxCount=0;
        char maxchar=' ';
        while (s1.length()!=0){
            char ch=s1.charAt(0);
            String s2=s1.replace(ch+"","");
            int count=s1.length()-s2.length();
            if (count>maxCount){
                maxCount=count;
                maxchar=ch;
            }
            s1=s2;

        }
        System.out.println(maxchar+"="+maxCount);

    }
}
