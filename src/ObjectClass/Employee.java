package ObjectClass;

public class Employee {
    String name;
    int age;
    int id;
    int mobile;

    public Employee(int age, String name, int id, int mobile) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.mobile = mobile;
    }

    @Override
    public  String toString(){
        return name+" "+ age+" "+id+" "+mobile;
    }

}

class Test{
    public static void main(String[] args) {
        Employee e1=new Employee(23,"Soumyak",121,778907138);
        Employee e2=new Employee(23,"Soumyak",121,778907138);
        System.out.println(e1);
        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));
    }
}