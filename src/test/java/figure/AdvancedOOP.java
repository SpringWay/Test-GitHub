package figure;

import java.util.Random;

public class AdvancedOOP {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int figuresCount = 100;
        Figure[] figures = getFigures(figuresCount);
        for (Figure f: figures
             ) {
            f.draw();
        }
    }

    private static Color getRandomColor(){
        int index = RANDOM.nextInt(Color.values().length);
        return Color.values()[index];
    }

    private static Circle getRandomCircle() {
        double radius = RANDOM.nextDouble();
        return new Circle(radius, getRandomColor());
    }

    private  static Triangle getRandomTriangle(){
        double cathetA = RANDOM.nextDouble();
        double cathetB = RANDOM.nextDouble();
        return new Triangle(cathetA, cathetB, getRandomColor());
    }

    private static Trapeze getRandomTrapeze(){
        double height = RANDOM.nextDouble();
        double sideA = RANDOM.nextDouble();
        double sideB = RANDOM.nextDouble();
        return new Trapeze(height, sideA, sideB, getRandomColor());
    }

    private  static Square getRandomSquare(){
        double side = RANDOM.nextDouble();
        return new Square(side, getRandomColor());
    }

    private static Figure getRandomFigure(){
        int figureIndex = RANDOM.nextInt(4);
        Figure randomFigure = null;
        switch (figureIndex){
            case 0: randomFigure = getRandomCircle();
            break;
            case 1: randomFigure = getRandomSquare();
            break;
            case 2: randomFigure =  getRandomTrapeze();
            break;
            case 3: randomFigure = getRandomTriangle();
            break;
        }
        return randomFigure;
    }

    public static Figure[] getFigures(int figuresCount){
        Figure[] figuresArray= new Figure[figuresCount];

        for (int i=0; i<figuresCount; i++){
            figuresArray[i] = getRandomFigure();
        }
        return  figuresArray;
    }

}