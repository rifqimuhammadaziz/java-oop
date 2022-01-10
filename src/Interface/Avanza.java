package Interface;

public class Avanza implements Car{
    public void drive() {
        System.out.println("Driving with Avanza");
    }

    public int getTier() {
        return 4;
    }
}
