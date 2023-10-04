public class Employee {
    protected String name = "Unknown";
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Manager extends Employee{

    public static void main(String []args) {
        // Create an object of the Manager class
        Manager mgr = new Manager();

        // Set the name of the manager
        mgr.setName("Mary");

        // Get the name of the manager
        String mgrName = mgr.getName();

        // Display the manager name
        System.out.println("Manager Name: " + mgrName);
        Employee emp = new Employee();

        emp.setName("Tom");
        String empName = emp.getName();
        System.out.println("Employee Name: " + empName);
    }

}
