package figure;

public class Triangle extends Figure {
   private double cathetA;
   private double cathetB;

    public Triangle(double cathetA, double cathetB, Color color) {
        this.cathetA = cathetA;
        this.cathetB = cathetB;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Фигура: триугольник, площадь: " + getArea() + " кв. ед., длина катетов: " + getCathetA() + " и "+ getCathetB() + " ед., цвет: " + getColor().toString());
    }


    public double getCathetA() {
        return cathetA;
    }

    public double getCathetB() {
        return cathetB;
    }
    @Override
    public double getArea() {
        return (getCathetA()*getCathetB())/2;
    }
}
