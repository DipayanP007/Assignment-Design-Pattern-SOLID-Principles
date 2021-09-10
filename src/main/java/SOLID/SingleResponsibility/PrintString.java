package SOLID.SingleResponsibility;

public class PrintString {
    String text;

    PrintString(String text) {
        this.text = text;
    }

    public void printString() {

        System.out.println(text);
    }

}
