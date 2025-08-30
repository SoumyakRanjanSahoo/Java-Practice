package RamanaSirQuestions.Arrays;

public class _13MinOccurCharcter {
    public static void main(String[] args) {
        String s1="rammana";
        int minCount=Integer.MAX_VALUE;
        char minchar=' ';
        while (s1.length()!=0){
            char ch=s1.charAt(0);
            String s2=s1.replace(ch+"","");
            int count=s1.length()-s2.length();
            if (count<minCount){
                minCount=count;
                minchar=ch;
            }
            s1=s2;

        }
        System.out.println(minchar+"="+minCount);

    }
}
