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
        id = idGenerator++;
        if (id > 10) {
            throw new IllegalArgumentException("Перебор");
        }


    }


}