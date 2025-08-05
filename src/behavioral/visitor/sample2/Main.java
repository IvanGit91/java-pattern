package behavioral.visitor.sample2;

/*
* The Visitor Pattern is a behavioral design pattern that lets you add new operations to existing object structures without modifying those structures.
* Instead, you separate the logic into visitor classes.
* */

/*
Imagine you have different types of shapes: Circle and Rectangle, and you want to perform operations like exportToSVG() or calculateArea() on them
without modifying their classes every time.

The Visitor pattern helps you achieve this.
* */

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        ShapeVisitor areaVisitor = new AreaCalculator();
        ShapeVisitor svgVisitor = new SvgExporter();

        circle.accept(areaVisitor); // Circle area: 78.53981633974483
        rectangle.accept(areaVisitor); // Rectangle area: 12.0

        circle.accept(svgVisitor); // <circle r="5.0" />
        rectangle.accept(svgVisitor); // <rect width="4.0" height="3.0" />
    }
}