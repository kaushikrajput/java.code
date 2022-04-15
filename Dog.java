import java.util.Arrays;

public class Dog {

    String name = "lucy";
    String breed = "rottweiler";
    int age = 5;
    String color = "brown";
}

class Second {

    public static void main(String[] args) {
        Dog obj1 = new Dog();
        Dog obj2 = new Dog();
        obj2.age = 3;
        System.out.println(obj1.name);
        System.out.println(obj2.age);

    }
}