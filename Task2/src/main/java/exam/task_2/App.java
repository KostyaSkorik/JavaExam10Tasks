package exam.task_2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        text=text.replaceAll(" ","");
        String[] letter = text.split(",");

        int[] numbers = new int[letter.length];

        for (int i=0 ; i<letter.length; i++){
            try {
                numbers[i] = Integer.parseInt(letter[i]);
            }catch (NumberFormatException e){
                System.out.println("Было введено не число "+ e.getMessage());
            }
        }

        int max = -1;
        double min = Double.POSITIVE_INFINITY;

        int index = 0;
        while (index<numbers.length){
            if (numbers[index]>max){
                max=numbers[index];
            }
            if (numbers[index]<min){
                min=numbers[index];
            }
            index++;
        }
        System.out.println(max);
        System.out.println((int) min);


    }
}
