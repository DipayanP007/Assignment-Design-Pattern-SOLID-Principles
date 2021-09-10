package SOLID.LSP;

public class Rectangle extends Shape {

    @Override
    public int calculateArea(int length, int width) {

        return length * width;
    }

}
