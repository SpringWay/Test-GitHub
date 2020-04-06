package figure;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Color color) {

        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Фигура: круг, площадь: " + getArea() + " кв. ед., длина радиуса: " + getRadius() + " ед., цвет: " + getColor().toString());
    }


}
