package demo;

public class Constructor01 {
    public static void main(String[] args) {
            Person p = new Person("xiaoli", 18);
            System.out.println(p.name + p.age);
    }

}

class Person{
    String name;
    int age;
    public Person (String pname,int page){
        name=pname;
        age=page;
    }
    public Person(String pname){
        name=pname;

    }
}
