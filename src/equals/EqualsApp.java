package equals;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Xenosty";
        first = first + " " + "Theords";

        System.out.println(first);

        String second = "Xenosty Theords";
        System.out.println(second);

        // Compare 2 different object (compare same object or not)
        System.out.println(first == second); // false
        System.out.println(first.equals(second)); // true (override/use equals method)

        String third = "Xenosty Theords";
        System.out.println(second == third); // true
    }
}
