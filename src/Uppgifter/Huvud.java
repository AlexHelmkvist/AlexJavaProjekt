package Uppgifter;

import java.util.Scanner;

public class Huvud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in några ord:" );
        String input = scanner.nextLine();
        LogicClass logic = new LogicClass(input);
        logic.processInput();
    }
}

class LogicClass {
    private String input;

    public LogicClass(String input) {
        this.input = input;
    }

    public void processInput() {
        if (input.equalsIgnoreCase("stop")) {
            System.out.println("Du skrev ordet 'stop'. Programmet avslutas.");
            return;
        }

        String[] words = input.split("\\s+");
        System.out.println("Antal ord: " + words.length);

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Det längsta ordet: " + longestWord);
    }
}


