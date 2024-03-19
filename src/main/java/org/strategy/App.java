package org.strategy;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException {
        File file = new File("src/main/textFile.txt");
        Scanner scanner = new Scanner(file);
        //TODO: reading not only one line
        String line = scanner.nextLine();
        Scanner choiceAction = new Scanner(System.in);
        boolean flagExit = true;
        int choice;
        while (flagExit) {
            System.out.println("Выберите действие: 1-считать только цифры. 2-считать только буквы." +
                    "3-считать только буквы и цифры. 4 - выход ");
            choice = choiceAction.nextInt();
            switch (choice) {
                case (1):
                    Parser parserNumbers = new Parser(new ParseOnlyNumbers());
                    parserNumbers.parsing(line);
                    break;
                case (2):
                    Parser parserLetters = new Parser(new ParseOnlyLetters());
                    parserLetters.parsing(line);
                    break;
                case (3):
                    Parser parserNumberLetter = new Parser(new ParseOnlyNumbersAndLetters());
                    parserNumberLetter.parsing(line);
                    break;
                case (4):
                    flagExit = false;
                    break;
            }
        }
    }
}
