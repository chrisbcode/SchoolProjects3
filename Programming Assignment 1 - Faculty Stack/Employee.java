/**
 * @author Christopher Bergsveinsson
 * @version 9/23/2025
 * CSC 223 
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 1 - Stack ADT program for Computer Science enrollment - Employee Class
 */
public class Employee extends Person {

    private int employeeId;

    public Employee() {
        super();
        employeeId = 0;
    }

    public Employee(String name) {
        super(name);
    }

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    public Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }


    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }


    @Override
    public String toString() {
        return super.getName() + " " + employeeId;
    }

    @Override
    public boolean equals(Object obj) {
        Employee employee = (Employee) obj;
        return (this.getEmployeeId() == employee.getEmployeeId()) && (this.getName().equals(employee.getName()));
    }

}

