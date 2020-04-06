package figure;

public class Square extends Figure {
    private double side;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;
    }
    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public void draw() {
        System.out.println("Фигура: квадрат, площадь: " + getArea() + " кв. ед., длина стороны: " + getSide() + " ед., цвет: " + getColor().toString());
    }

}
