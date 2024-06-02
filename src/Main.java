public class Main {

    private static Employee[] employees = new Employee[11];

    public static void main(String[] args) {
        employees[0] = new Employee("Антонов", "Антон", "Антонович", 1000, 1);
        employees[1] = new Employee("Иванов", "Иван", "Иванович", 1100, 1);
        employees[2] = new Employee("Петров", "Петр", "Петрович", 1300, 1);
        employees[3] = new Employee("Сидоров", "Сидр", "Сидорович", 1200, 2);
        employees[4] = new Employee("Михайлов", "Михаил", "Михайлович", 1300, 2);
        employees[5] = new Employee("Кротов", "Крот", "Кротович", 1100, 2);
        employees[6] = new Employee("Тихонов", "Тихон", "Тихонович", 1600, 3);
        employees[7] = new Employee("Пирогов", "Пирог", "Пирогович", 1700, 3);
        employees[8] = new Employee("Дроздов", "Дрозд", "Дроздович", 1800, 4);
        employees[9] = new Employee("Синичкин", "Снегирь", "Снегиревич", 1700, 4);
        employees[10] = new Employee("Орлов", "Орел", "Орелович", 2300, 5);

        printEmployees();
        System.out.println("=============");
        System.out.println(salariesSum());
        System.out.println("=============");
        System.out.println(findMinSalary());
        System.out.println("=============");
        System.out.println(findMaxSalary());
        System.out.println("=============");
        System.out.println(averageSalary());
        System.out.println("=============");
        printFIO();
        System.out.println("=============");
        System.out.println(salariesSum(3));
        System.out.println("=============");
        System.out.println(findMaxSalary(1));
        System.out.println("=============");
        System.out.println(findMinSalary(1));
        System.out.println("=============");
        System.out.println(averageSalary(1));
        System.out.println("=============");
        printEmployeeSalaryLess(2000);
        System.out.println("=============");
        printEmployeeSalaryLess(1000);
        System.out.println("=============");
        printEmployee(1);
        System.out.println("=============");
        indexSalary(20);
        indexSalary(1,1.2);
        printEmployee(1);

    }

    public static void  printEmployees(){
        for (Employee employee : employees) {
            System.out.println(employee);

        }
    }

    public static int salariesSum(){
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static int salariesSum(int group){
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getGroup() == group) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    private static Employee findMinSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    private static Employee findMinSalary(int group) {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getGroup() != group) {
                continue;
            }
            if (employee.getSalary() < min.getSalary()){
                min = employee;
            }
        }
        return min;
    }

    private static Employee findMaxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    private static Employee findMaxSalary(int group) {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getGroup() == group && employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }


    public static double averageSalary(){
        return salariesSum() / employees.length;
    }

    public static double averageSalary(int group){
        int countInGroup = 0;
        for (Employee employee : employees){
            if (employee.getGroup() == group) {
                countInGroup++;
            }
        }
        return (double) salariesSum() / countInGroup;
    }

    public static void printFIO() {
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getSecondName() + " " + employee.getLastName());

        }
    }



    public static void indexSalary(double percent){
        for (Employee employee : employees) {
            employee.setSalary((int) (employee.getSalary() * percent));
        }
    }

    public static void indexSalary(int group, double percent){
        for (Employee employee : employees) {
            if (employee.getGroup() == group) {
                employee.setSalary((int) (employee.getSalary() * percent));
            }
        }
    }

    private static void printEmployee(int group) {
        for (Employee employee : employees) {
            if (employee.getGroup() == group) {
                System.out.println(String.format("%d % %s %d %n",employee.getId() ,employee.getFirstName(), employee.getSecondName(), employee.getLastName(), employee.getSalary()));
            }
        }
    }

    private static void printEmployeeSalaryLess(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.printf("%d % %s %d %n%n",employee.getId() ,employee.getFirstName(), employee.getSecondName(), employee.getLastName(), employee.getSalary());

            }
        }
    }

    private static void printEmployeeSalaryGreater(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println(String.format("%d % %s %d %n",employee.getId() ,employee.getFirstName(), employee.getSecondName(), employee.getLastName(), employee.getSalary()));

            }
        }
    }

}
