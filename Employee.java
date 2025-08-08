public abstract class Employee extends Person {
    // Employee-specific field
    private String office;

    // Default constructor
    public Employee() {
        super();
    }

    // Parameterized constructors
    public Employee(String id, String name, String email) {
        super(id, name, email);
    }

    public Employee(String id, String name, String email, String office) {
        super(id, name, email);
        this.office = office;
    }

    // Getter and setter for office
    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    // Abstract method to be implemented by subclasses
    public abstract String getEmployeeType();

    // Override toString to include office information
    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                ", office='" + office + '\'' +
                '}';
    }
}