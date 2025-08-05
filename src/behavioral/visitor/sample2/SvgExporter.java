package behavioral.visitor.sample2;

public class SvgExporter implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("<circle r=\"" + circle.radius + "\" />");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("<rect width=\"" + rectangle.width + "\" height=\"" + rectangle.height + "\" />");
    }
}