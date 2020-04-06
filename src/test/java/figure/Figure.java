package figure;

import java.awt.*;

public abstract class Figure {
    protected Color color;

    public Color getColor() {

        return color;

    }
    public abstract double getArea();
    public abstract void draw();
}
