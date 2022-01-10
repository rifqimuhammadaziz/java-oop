package Interface;

public class Bus implements Car {
    public void drive() {
        System.out.println("Drive on Bus!");
    }

    public int getTier() {
        return 8;
    }

    public String getBrand() {
        return "Mitsubishi";
    }

    public boolean isMaintenance() {
        return false;
    }

    public boolean isBig() {
        return true;
    }
}
