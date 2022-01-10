package GetterSetter;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();

        category.setId("ID Category");
        category.setId(null); // can't set null id (rejected)

        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
