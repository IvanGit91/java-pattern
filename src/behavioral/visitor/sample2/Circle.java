package behavioral.visitor.sample2;

// 2. Concrete Elements
public class Circle implements Shape {
    public double radius = 5.0;

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}