package abstractClass;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); // ERROR
        var city = new City();
        city.name = "Tegal";

        System.out.println(city.name);
    }
}
