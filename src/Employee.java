import java.util.Objects;


public class Employee {

    private static int idGenerator = 1;

    private final String firstName;
    private final String secondName;
    private final String lastName;
    private int salary;
    private int group;
    private int id;

    public Employee(String firstName, String secondName, String lastName, int salary, int group) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.salary = salary;
        this.group = group;
        this.id = idGenerator++;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getGroup() {
        return group;
    }

    public int getId() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", group=" + group +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && group == employee.group && id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(secondName, employee.secondName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, lastName, salary, group, id);
    }
}