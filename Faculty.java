public class Faculty extends Employee {
    // Faculty-specific field
    private String rank;

    // Default constructor
    public Faculty() {
        super();
    }

    // Parameterized constructors
    public Faculty(String id, String name, String email) {
        super(id, name, email);
    }

    public Faculty(String id, String name, String email, String office, String rank) {
        super(id, name, email, office);
        this.rank = rank;
    }

    // Getter and setter for rank
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    // Implement abstract method from Employee
    @Override
    public String getEmployeeType() {
        return "Faculty";
    }

    // Override toString to include rank information
    @Override
    public String toString() {
        return "Faculty{" +
                super.toString() +
                ", rank='" + rank + '\'' +
                '}';
    }
}

