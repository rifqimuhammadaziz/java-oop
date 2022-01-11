package innerClass;

public class NestedApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Xenosty Company");

        // create Employee instance from existing Company instance
        Company.Employee employee = company.new Employee();
        employee.setName("Rifqi Muhammad Aziz");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company1 = new Company();
        company1.setName("Empty Company");
        Company.Employee employee1 = company1.new Employee();
        employee1.setName("Bagas");

        System.out.println(employee1.getName());
        System.out.println(employee1.getCompany());
    }
}
