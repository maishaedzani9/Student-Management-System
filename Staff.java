public class Staff extends Employee {
    // Staff-specific field
    private String title;

    // Default constructor
    public Staff() {
        super();
    }

    // Parameterized constructors
    public Staff(String id, String name, String email) {
        super(id, name, email);
    }

    public Staff(String id, String name, String email, String office, String title) {
        super(id, name, email, office);
        this.title = title;
    }

    // Getter and setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Implement abstract method from Employee
    @Override
    public String getEmployeeType() {
        return "Staff";
    }

    // Override toString to include title information
    @Override
    public String toString() {
        return "Staff{" +
                super.toString() +
                ", title='" + title + '\'' +
                '}';
    }
}
