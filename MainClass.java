public class MainClass {
    // static void myMethod() {
    // System.out.println("hello ");

    // }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 21;
        p1.name = "sahil";

        System.out.println(p1.name + " " + p1.age);

        Person p2 = new Person();
        p2.name = "santy";

        p1.walk();
        p2.eat();
        // myMethod(); call myMethod

    }
}

class Person {
    String name;
    int age;

    void walk() {
        System.out.println(name + " is walking");
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}
