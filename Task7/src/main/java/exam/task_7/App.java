package exam.task_7;

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
        try {
            System.out.println("Введите сторону а прямоугольника");
            int sideA = scanner.nextInt();
            System.out.println("Введите сторону b прямоугольника");
            int sideB = scanner.nextInt();
            RectangularArea rectangularArea = new RectangularArea(sideA,sideB);
            Thread rectangularAreaThread = new Thread(rectangularArea);
            rectangularAreaThread.start();
        }catch (InputMismatchException ex){
            System.out.println("Введены некорректные значения сторон "+ex.getMessage());
        }
    }
}
