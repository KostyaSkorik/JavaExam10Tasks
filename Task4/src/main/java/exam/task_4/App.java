package exam.task_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        HashMap<String,String> jobNameMap = new HashMap<>();
        int flag=1;
        Scanner scanner = new Scanner(System.in);
        while (flag==1){
            System.out.println("Введите вашу работу");
            String job = scanner.nextLine();
            System.out.println("Введите ваше имя");
            String name = scanner.next();
            if (job.isEmpty() || name.isEmpty()){
                System.out.println("Не был введен либо ключ, либо значение ");
                throw new NullPointerException();
            }
            System.out.println("Продолжить заполнение? 0-нет, 1-да");
            flag=scanner.nextInt();

        }

        TreeMap<String,String> sortedJobNameMap = new TreeMap<>(jobNameMap);

        for (Map.Entry<String,String> entry: sortedJobNameMap.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);
        }


    }
}
