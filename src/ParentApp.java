public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Rifqi";
        child.thisIsMethod(); // Method from Child
        System.out.println(child.name); // Rifqi

        // create instance from top of parent (method is not overridden)
        Parent topParent = new Parent();
        topParent.thisIsMethod();

        // create parent from child (Type data is Parent, but the object is Child that the method is overriden)
        Parent parent = (Parent) child;
        parent.thisIsMethod(); // method from Child
        System.out.println(parent.name); // null, the instance 'parent' not set name
    }
}
