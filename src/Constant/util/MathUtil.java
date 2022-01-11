package Constant.util;

public class MathUtil {
    /**
     * Static method : no need to create instance of object for access method
     */
    public static int sum(int... values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }
        return total;
    }
}
