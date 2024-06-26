package exam.task_8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для поиска факториала:");
        try {
            int value = scanner.nextInt();
            Thread factorialThread = new Facrotial(value);
            factorialThread.start();
        }catch (InputMismatchException ex){
            System.out.println("Введено некорректное значение "+ex.fillInStackTrace());
        }


    }
}
