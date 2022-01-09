class Shape {
    int getCorner() {
        return 0;
    }
}
class Rectangle extends Shape {
    int getCorner() {
        return 4;
    }

    /**
     * Get parent method that previously the method is override in child class
     * @return parent method
     */
    int getParentCorner() {
        return super.getCorner();
    }
}
