package org.strategy;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException {
        File file = new File("src/main/textFile.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        Parser parser = new Parser(new ParseOnlyNumbers());
        parser.parsing(line);
        Parser parser2 = new Parser(new ParseOnlyLetters());
        parser2.parsing(line);
    }
}
