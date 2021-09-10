package SOLID.LSP;

public class AreaCalculation {

    public static void main(String[] args) {


        Shape rectangleArea = new Rectangle();
        Shape squareArea = new Square();
        System.out.println(rectangleArea.calculateArea(10, 20));
        System.out.println(squareArea.calculateArea(10, 10));
    }
}