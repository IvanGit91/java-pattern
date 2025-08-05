package behavioral.visitor.sample2;

// 2. Concrete Elements
public class Rectangle implements Shape {
    public double width = 4.0;
    public double height = 3.0;

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}