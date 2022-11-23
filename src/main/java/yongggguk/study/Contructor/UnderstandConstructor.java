package yongggguk.study.Contructor;


class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class UnderstandConstructor {

    public static void main(String args[]){
        UnderstandConstructor uc = new UnderstandConstructor();
        Person p = new Person("yong", 1);
        System.out.println(p);
        p = new Person("tes", 12);
        System.out.println(p);
   }
}