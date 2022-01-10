package Interface;

public interface Car extends HasBrand, IsMaintenance {
    void drive();
    int getTier();

    /**
     * Default method : child/inherited class not mandatory to override method (java 8++)
     * @return
     */
    default boolean isBig() {
        return false;
    }
}
