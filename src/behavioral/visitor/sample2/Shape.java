package behavioral.visitor.sample2;

// 1. Element Interface (accepts a visitor)
public interface Shape {
    void accept(ShapeVisitor visitor);
}
