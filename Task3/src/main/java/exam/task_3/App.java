package exam.task_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ArrayList<Person> people = new ArrayList<>();
        int flag=1;
        Scanner scanner = new Scanner(System.in);
        while (flag==1) {
            System.out.println("Введите Имя");
            String name = scanner.next();
            System.out.println("Введите Фамилию");
            String surname = scanner.next();
            System.out.println("Введите возраст");
            int age = scanner.nextInt();
            System.out.println("Введите Работу");
            String job = scanner.next();
            Person person = new Person(name, surname, age, job);
            people.add(person);
            System.out.println("Продолжить заполнение? 0-нет, 1-да");
            flag=scanner.nextInt();
        }


        people.sort(Person::compareTo);
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
