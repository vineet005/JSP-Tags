public class Employee {
    private final String NAME;
    private final String DEPARTMENT;

    public Employee(String name, String department) {
        this.NAME = name;
        this.DEPARTMENT = department;
    }

    public String getName() {
        return NAME;
    }

    public String getDepartment() {
        return DEPARTMENT;
    }
}
