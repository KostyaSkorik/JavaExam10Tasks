package exam.task_6;

import java.io.*;

public class Message implements Serializable {

    private String text;
    private long number;
    private int cost;

    public Message(String text, long number, int cost) {
        this.text = text;
        this.number = number;
        this.cost = cost;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public static void SerialazeMessage(Message message, String way) {
        try {
            FileOutputStream fos = new FileOutputStream(way);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(message);
            System.out.println("Объект успешно сериализован");
            oos.flush();
        } catch (IOException ex) {
            System.out.println("Ошибка сериализации сущности " + ex.getMessage());
        }
    }

    public static Message deserializationMessage(String way) throws ClassNotFoundException {
        try {
            FileInputStream fis = new FileInputStream(way);
            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println("Объект успешно десериализован");
            return (Message) ois.readObject();
        } catch (IOException ex) {
            System.out.println("Ошибка десериализации объекта " + ex.getMessage());
        }
        return null;
    }

    @Override
    public String toString() {
        return this.text+" "+ getNumber()+" "+getCost();
    }
}
