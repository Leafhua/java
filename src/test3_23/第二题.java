package test3_23;


public class 第二题 {
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        Cylinder c2 = new Cylinder(2,5);
        System.out.println("c1面积为："+c1.area()+"体积为："+c1.volume());
        System.out.println("c2面积为："+c2.area()+"体积为："+c2.volume());

    }

}

abstract class Point{
    abstract double area();
    abstract double volume();
    double x,y;
    static double PI=3.1415926;
}
class Circle extends Point{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return radius*radius*PI;
    }

    @Override
    double volume() {
        return (4*radius*radius*radius*PI)/3;
    }
}
class Cylinder extends Point{
    double height,radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    double area() {
        return (radius*radius*PI*2+2*PI*radius*height);
    }

    @Override
    double volume() {
        return radius*radius*PI*height;
    }
}