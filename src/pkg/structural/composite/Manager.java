package pkg.structural.composite;

/**
 * Leaf Object
 */
public class Manager implements Employee {
    private long empId;
    private String name;
    private String position;

    public Manager(long empId, String name, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId+" " +name+ " " + position );
    }
}
