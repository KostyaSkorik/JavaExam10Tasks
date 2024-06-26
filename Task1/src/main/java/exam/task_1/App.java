package exam.task_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи строку");
        String text = scanner.nextLine();
        StringBuilder firstConveredString = new StringBuilder(text);
        StringBuilder secondConveredString = new StringBuilder(text);
        String thirdConveredString;

        firstConveredString.reverse();

        secondConveredString.deleteCharAt(0);
        secondConveredString.deleteCharAt(secondConveredString.length()-1);

        thirdConveredString=text.toUpperCase();

        String result = firstConveredString + "\n"
                + secondConveredString + "\n"
                +thirdConveredString;

        SaverInFile.SaverInFile(result,"C:\\Java\\Подготовка к экзамену\\Task1\\Преобразованные строки.txt");

    }
}
