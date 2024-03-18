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
        System.out.println(line);
        Parser parser = new Parser(new ParseOnlyLetters());
        parser.parsing(line);
    }
}
