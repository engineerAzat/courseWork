import java.util.Objects;


public class Employee {


    private static int id;
    private Persons persons;
    private int salary;
    private int group;
    //private int id;

    public Employee(Persons persons, int salary, int group, int counter) {
        this.persons = persons;
        this.salary = salary;
        this.group = group;
        id++;
        if (id > 10 ) {
            throw new IllegalArgumentException("Перебор");
        }
        // this.id = id;




    }

    public static int getCounter() {
        return id;
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
        //Employee.counter = counter;
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

    @Override
    public String toString() {
        return "Employee{" +
                "persons=" + persons +
                ", salary=" + salary +
                ", group=" + group +
                '}';
    }
}
