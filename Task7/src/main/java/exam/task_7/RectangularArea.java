package exam.task_7;

import java.util.InputMismatchException;

public class RectangularArea implements Runnable {
    private int sideA;
    private int sideB;

    public RectangularArea(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public void run() {
        int area = getSideA()*getSideB();
        System.out.println("Площадь прямоугольника равна: "+ area);

    }
}
