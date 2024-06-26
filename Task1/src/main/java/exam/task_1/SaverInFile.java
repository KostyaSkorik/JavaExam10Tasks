package exam.task_1;

import java.io.FileWriter;
import java.io.IOException;

public class SaverInFile {
    public static void SaverInFile(String text, String way){
        try {
            FileWriter writer = new FileWriter(way);
            writer.write(text);
            writer.flush();
        }catch (IOException ex){
            System.out.println("Ошибка чтения файла "+ex.getMessage());
        }
    }
}
