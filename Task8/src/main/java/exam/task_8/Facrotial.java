package exam.task_8;

public class Facrotial extends Thread{

    private int value;

    public Facrotial(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int factorial(int value){

        if (value<2){
            return 1;
        }
        return value*factorial(value-1);
    }

    @Override
    public void run() {
        System.out.println(factorial(getValue()));
    }
}
