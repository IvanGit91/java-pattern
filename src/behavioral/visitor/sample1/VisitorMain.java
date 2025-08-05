package behavioral.visitor.sample1;

import behavioral.visitor.sample1.shapes.Circle;
import behavioral.visitor.sample1.shapes.CompoundShape;
import behavioral.visitor.sample1.shapes.Dot;
import behavioral.visitor.sample1.shapes.Rectangle;
import behavioral.visitor.sample1.shapes.Shape;
import behavioral.visitor.sample1.visitor.XMLExportVisitor;

/*
 * Visitor is a behavioral design pattern that allows adding new behaviors to existing class hierarchy without altering any existing code.
 * 
 * Usage examples: Visitor isn’t a very common pattern because of its complexity and narrow applicability.
 */
public class VisitorMain {

    /*
     * Exporting shapes into XML
     * In this example, we would want to export a set of geometric shapes into XML. The catch is that we don’t want to change the code of shapes directly or at least keep it to the minimum.
     * In the end, the Visitor pattern establishes an infrastructure that allows us to add any behaviors to the shapes hierarchy without changing the existing code of those classes
     */
    
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);
    }

    private static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }

}
