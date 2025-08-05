package behavioral.visitor.sample1.visitor;

import behavioral.visitor.sample1.shapes.Circle;
import behavioral.visitor.sample1.shapes.CompoundShape;
import behavioral.visitor.sample1.shapes.Dot;
import behavioral.visitor.sample1.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}