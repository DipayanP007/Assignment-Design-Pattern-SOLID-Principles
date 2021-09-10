package SOLID.LSP;

public class Square extends Shape {

    @Override
    public int calculateArea(int length, int width) {

        return length * width;
    }

}
