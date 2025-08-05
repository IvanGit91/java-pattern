package behavioral.visitor.sample2;

// 3. Visitor Interface
public interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}