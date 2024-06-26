package exam.task_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LoadFile{

    public static byte[] loadText(String way) {
        File f = new File(way);
        if (f.exists() && f.isFile()) {
            try(FileInputStream fis = new FileInputStream(f)) {
                byte[] data = new byte[fis.available()];
                fis.read(data);
                return data;
            } catch (IOException ex) {
                System.out.println("Ошибка открытия файла "+ex.getMessage());
            }
        }
        throw new NullPointerException("Файла не существует");
    }
}
