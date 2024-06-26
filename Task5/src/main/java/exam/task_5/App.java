package exam.task_5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        String[] vowes = {"a","o","e","i","u","y"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        String way = scanner.nextLine();
        byte[] text = LoadFile.loadText(way);
        if (text.length!=0){
            StringBuilder result = new StringBuilder();
            for (byte i:text){
                result.append((char) i);
            }
            System.out.println(result);

            result = new StringBuilder((result.toString().replaceAll("(?i)[aoeiuy]", "")));

            System.out.println(result);
        }else {
            System.out.println("Пустой файл");
        }


    }
}
