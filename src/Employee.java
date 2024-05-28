import java.util.Objects;


public class Employee {


    private static int counter = 1;
    private Persons persons;
    private int salary;
    private int group;
    private int id;

    public Employee(Persons persons, int salary, int group, int counter) {
        this.persons = persons;
        this.salary = salary;
        this.group = group;
        this.id = counter;

    }

    public static int getCounter() {
        return counter;
    }

    public Persons getPersons() {
        return persons;
    }

    public int getSalary() {
        return salary;
    }

    public int getGroup() {
        return group;
    }

    public int getId() {
        return id;
    }

    public static void setCounter(int counter) {
        Employee.counter = counter;
    }

    public void setPersons(Persons persons) {
        this.persons = persons;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && group == employee.group && id == employee.id && Objects.equals(persons, employee.persons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(persons, salary, group, id);
    }
}
