package exam.task_10;

import java.io.*;
import java.net.URL;

public class WebPageRunnable implements Runnable{

    private String url;
    private String fileName;

    public WebPageRunnable(String url, String fileName) {
        this.url = url;
        this.fileName = fileName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            String currentLine;
            while ((currentLine = reader.readLine())!=null){
                writer.write(currentLine);
                writer.newLine();//перенос строк
            }
            System.out.println("Веб-страница успешно сохранена");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
