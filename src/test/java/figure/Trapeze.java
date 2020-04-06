package figure;

public class Trapeze extends Figure {
    private double height;
    private double sideA;
    private double sideB;

    public Trapeze(double height, double sideA, double sideB, Color color) {
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }


    @Override
    public double getArea() {
        return ((getSideA()/2)+(getSideB()/2))*getHeight();
    }

    @Override
    public void draw() {
        System.out.println("Фигура: трапеция, площадь: " + getArea() + " кв. ед., высота: "
                + getHeight() + " ед., стороны: " + getSideA() + " и "
                + getSideB() + " ед., цвет: " + getColor().toString());

    }

    public double getHeight() {
        return height;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
}
