package exam.task_10;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите url");
        String url = scanner.nextLine();

        System.out.println("Введите файл куда сохранять веб-страницу");
        String fileName = scanner.nextLine();

        WebPageRunnable downloader = new WebPageRunnable(url,fileName);
        Thread webThread = new Thread(downloader);
        webThread.start();

    }
}
