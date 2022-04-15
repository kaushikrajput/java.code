import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Employee {
    int salary;
    String name;

    public int getSalary() {

        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class Ringing {
    public void ringing() {
        System.out.println("ringing...");

    }

    public void callFriend() {
        System.out.println("call vivek...");
    }

    public void vibrating() {
        System.out.println("vibrating...");
    }
}

class Rectangle {
    int length, bredth;

    public int area() {
        return length * bredth;

    }

    public int perimeter() {
        return 2 * (length + bredth);
    }
}

class Circle {
    private int radius;
    private int area;

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public void setArea(int a) {
        this.area = a;
    }

    public static void main(String[] args) {
        // Employee sahil = new Employee();
        // sahil.setName("sahil rajput");
        // sahil.salary = 23;
        // System.out.println(sahil.getSalary());
        // System.out.println(sahil.getName());

        //////////////////////// problem 2

        // Square sq = new Square();
        // sq.side = 4;
        // System.out.println(sq.area());
        // System.out.println(sq.perimeter());

        //////////////////////// problem 3

        // Ringing xiomi = new Ringing();

        // xiomi.callFriend();
        // xiomi.vibrating();
        // xiomi.ringing();

        ////////////////////// problem 4

        // Rectangle rec = new Rectangle();
        // rec.length = 2;
        // rec.bredth = 4;
        // System.out.println("area of rectangle: " + rec.area());
        // System.out.println("perimeter of rectangle: " + rec.perimeter());

        //////////////////// problem 5

        Circle cr = new Circle();
        cr.radius = 4;
        System.out.println("area of circle: " + cr.getArea());
        System.out.println("perimeter of circle: " + cr.getPerimeter());

    }
}
