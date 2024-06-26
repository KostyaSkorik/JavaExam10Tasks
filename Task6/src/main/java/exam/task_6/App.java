package exam.task_6;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) throws ClassNotFoundException {
        Message message=new Message("hello",89089732186L,25);
        String way = "C:\\Java\\Подготовка к экзамену\\Task6\\serObj.ser";

        Message.SerialazeMessage(message,way);

        Message message1 = Message.deserializationMessage("C:\\Java\\Подготовка к экзамену\\Task6\\serObj.ser");
        System.out.println(message1);

    }
}
