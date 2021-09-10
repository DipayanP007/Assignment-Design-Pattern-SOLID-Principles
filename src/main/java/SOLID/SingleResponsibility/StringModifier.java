package SOLID.SingleResponsibility;

public class StringModifier {

    public static void main(String[] args) {


        System.out.println("Enter String");
        String text = new InputString().getString();
        String modifiedText= new ModifyCharacters(text).modifyCharactersAtOddIndex();
        String reversedText = new ReverseString(text).reverseString();
        new PrintString(modifiedText).printString();
        new PrintString(reversedText).printString();

    }
}