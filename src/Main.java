public class Main {

    public static void main(String[] args) {


        Persons antonov = new Persons("Антонов", "Антон", "Антонович");
        Employee antono  = new Employee(antonov, 15000, 1, Employee.getCounter());
        System.out.println("antono = " + antono.getPersons());
        // antono.getEmployee().sout
        System.out.println(antono.getEmployer());



        System.out.println(antono.getId());

        Persons ivanov = new Persons("Иванов", "Иван", "Иванович");
        Employee ivan = new Employee(ivanov, 16000, 2, Employee.getCounter());
        System.out.println("ivanov = " + ivan.getPersons());
        System.out.println(ivan.getId());


    }
}