package BT1;

public class Circle {
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimester() {
        return Math.PI * radius * 2;
    }

    public String display() {
        return "Circle{" + "radius: " + this.radius + "}";
    }

}
