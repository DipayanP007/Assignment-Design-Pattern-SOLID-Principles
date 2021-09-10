package SOLID.SingleResponsibility;

import java.util.Scanner;

class InputString {

    public String getString() {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }
}
