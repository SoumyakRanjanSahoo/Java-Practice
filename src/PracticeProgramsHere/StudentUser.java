package PracticeProgramsHere;

import java.util.Arrays;

public class StudentUser {
    public static void main(String[] args) {
        student s1=new student("soumyak",22,97);
        student s2=new student("asis",24,94);
        student s3=new student("yogith",13,77);
        student s4=new student("kunal",19,80);
        student s5=new student("raju",28,100);

        student[] students={s1,s2,s3,s4,s5};
        Arrays.sort(students);
        for (student s:students){
            System.out.println(s);
        }
    }
}
