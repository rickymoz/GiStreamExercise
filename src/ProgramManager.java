import java.util.*;
import java.util.stream.Collectors;

public class ProgramManager {
    public void createEmployees() {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Bob", "Smith", 30, "IT", 3, 2500));
        employeeList.add(new Employee("Charlie", "Williams", 35, "FINANCE", 6, 3000));
        employeeList.add(new Employee("David", "Brown", 28, "MARKETING", 3, 2200));
        employeeList.add(new Employee("Eva", "Davis", 25, "SALES", 1, 2400));
        employeeList.add(new Employee("Frank", "Miller", 32, "IT", 4, 2800));
        employeeList.add(new Employee("Grace", "Wilson", 40, "FINANCE", 15, 3500));
        employeeList.add(new Employee("Henry", "Moore", 27, "HR", 2, 2100));
        employeeList.add(new Employee("Ivy", "Clark", 33, "MARKETING", 7, 2600));
        employeeList.add(new Employee("Jack", "White", 29, "SALES", 2, 2300));
        employeeList.add(new Employee("Katherine", "Harris", 31, "IT", 5, 2700));
        employeeList.add(new Employee("Leo", "Martin", 38, "FINANCE", 12, 3200));
        employeeList.add(new Employee("Mia", "Anderson", 26, "HR", 1, 2000));
        employeeList.add(new Employee("Frank", "Thompson", 34, "MARKETING", 8, 2900));
        employeeList.add(new Employee("Olivia", "Johnson", 36, "SALES", 3, 3100));
        employeeList.add(new Employee("Xavier", "Wilson", 39, "IT", 6, 3300));
        employeeList.add(new Employee("Quinn", "Taylor", 37, "FINANCE", 11, 3400));
        employeeList.add(new Employee("Ryan", "Williams", 24, "HR", 1, 1900));
        employeeList.add(new Employee("Samantha", "Brown", 28, "MARKETING", 4, 2200));
        employeeList.add(new Employee("Thomas", "Smith", 32, "SALES", 5, 2800));
        employeeList.add(new Employee("Ursula", "Miller", 30, "IT", 3, 2600));
        employeeList.add(new Employee("Vincent", "Harris", 35, "FINANCE", 9, 3200));
        employeeList.add(new Employee("Wendy", "Clark", 29, "HR", 2, 2000));
        employeeList.add(new Employee("Xavier", "Jones", 33, "MARKETING", 6, 2700));
        employeeList.add(new Employee("Yasmine", "Martin", 31, "SALES", 4, 2400));
        employeeList.add(new Employee("Zachary", "Anderson", 37, "IT", 8, 3100));
        employeeList.add(new Employee("Alice", "Cooper", 26, "FINANCE", 3, 2300));
        employeeList.add(new Employee("Benjamin", "Parker", 28, "HR", 1, 2100));
        employeeList.add(new Employee("Chloe", "Taylor", 34, "MARKETING", 7, 2900));
        employeeList.add(new Employee("Dylan", "Thompson", 36, "SALES", 9, 3300));

        menu(employeeList);
    }
    public void menu(List<Employee> employees) {
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("MENU");
            System.out.println("1. Count the number of employees that having been working at that department for more than n years\n" +
                    "2. Find the name of the employees that have a salary over n\n" +
                    "3. Get the oldest n employees\n" +
                    "4. Find the first employee older than n\n" +
                    "5. Find the average salary in a department\n" +
                    "6. Finding common first names between the employees of two departments\n" +
                    "0. Exit");

            System.out.print("=> ");
            try {
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("\nEnter the number of years you want to filter: ");
                        int yearsToFilter = scan.nextInt();
                        long count = getNumberOfEmployeesWorkingMoreThanNYears(employees, yearsToFilter);
                        System.out.println("\nNumber of employees working more than " + yearsToFilter + " years: " + count + "\n");
                        break;
                    case 2:
                        System.out.print("\nFind the name of the employees that have a salary over: ");
                        int salaryToFilter = scan.nextInt();
                        System.out.println(getEmployeesWithSalaryOverN(employees, salaryToFilter));
                        break;
                    case 3:
                        System.out.print("\nEnter the number of oldest employees you pretend to display: ");
                        int numberOfOldestToFilter = scan.nextInt();
                        System.out.println(getOldestNEmployees(employees, numberOfOldestToFilter));
                        break;
                    case 4:
                        System.out.print("\nFind the first employee older than: ");
                        int ageToFilter = scan.nextInt();
                        System.out.println(getFirstEmployeeOlderThanN(employees, ageToFilter));
                        break;
                    case 5:
                        System.out.println("\nDepartments: IT, FINANCE, MARKETING, SALES, HR");
                        System.out.print("=> ");
                        String departmentToFilter = scan.next();
                        if (departmentToFilter.equals("IT") || departmentToFilter.equals("FINANCE") || departmentToFilter.equals("MARKETING") || departmentToFilter.equals("SALES") || departmentToFilter.equals("HR")) {
                            System.out.println("\nThe average salary of " + departmentToFilter + " department is: " + getAverageSalaryInADepartment(employees, departmentToFilter) + "€\n");
                        } else {
                            System.out.println("\nInvalid department!\n");
                        }
                        break;
                    case 6:
                        System.out.println("\nDepartments: IT, FINANCE, MARKETING, SALES, HR");
                        System.out.print("First Department => ");
                        String department1 = scan.next().toUpperCase();
                        System.out.print("Second Department => ");
                        String department2 = scan.next().toUpperCase();

                        if (!department1.equals(department2)) {
                            List<String> commonEmployees = getCommonFirstNamesBetweenEmployeesOfDifferentDepartments(employees, department1, department2);

                            if (!commonEmployees.isEmpty()) {
                                System.out.println("\nCommon Names in Departments " + department1 + " & " + department2 + ": " + commonEmployees + "\n");
                            } else {
                                System.out.println("\nThere are no employees with common first names in the departments: " + department1 + " & " + department2 + "\n");
                            }
                        } else {
                            System.out.println("\nYou need to select two different departments!\n");
                        }
                        break;
                    case 0:
                        System.out.println("🥲bye");
                        System.exit(0);
                    default:
                        System.out.println("\nInvalid option\n");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nOnly numbers!\n");
                scan.next();
            }
        }
    }

    public long getNumberOfEmployeesWorkingMoreThanNYears(List<Employee> employees, int years) {
        return employees.stream()
                .filter(e -> e.getEmployeeYearsWorking() > years)
                .count();
    }

    public List<String> getEmployeesWithSalaryOverN(List<Employee> employees, int salary) {
        return employees.stream()
                .filter(e -> e.getEmployeeSalary() > salary)
                .map(e -> e.getEmployeeFirstName() + " " + e.getEmployeeLastName())
                .collect(Collectors.toList());
    }

    public List<String> getOldestNEmployees(List<Employee> employees, int number) {
        return employees.stream()
                .sorted(Comparator.comparingInt(Employee::getEmployeeAge).reversed())
                .limit(number)
                .map(e -> e.getEmployeeFirstName() + " " + e.getEmployeeLastName())
                .collect(Collectors.toList());
    }

    public List<String> getFirstEmployeeOlderThanN(List<Employee> employees, int age) {
        return employees.stream()
                .filter(e -> e.getEmployeeAge() > age)
                .limit(1)
                .map(e -> e.getEmployeeFirstName() + " " + e.getEmployeeLastName())
                .collect(Collectors.toList());
    }

    public long getAverageSalaryInADepartment(List<Employee> employees, String department) {
        return employees.stream()
                .filter(e -> e.getEmployeeDepartment().equals(department))
                .mapToInt(Employee::getEmployeeSalary)
                .sum();
    }

    public List<String> getCommonFirstNamesBetweenEmployeesOfDifferentDepartments(List<Employee> employees, String department1, String department2) {
        List<String> department1Employee = employees.stream()
                .filter(e -> e.getEmployeeDepartment().equals(department1))
                .map(Employee::getEmployeeFirstName)
                .toList();

        List<String> department2Employee = employees.stream()
                .filter(e -> e.getEmployeeDepartment().equals(department2))
                .map(Employee::getEmployeeFirstName)
                .toList();

        return department1Employee.stream()
                .distinct()
                .filter(department2Employee::contains)
                .collect(Collectors.toList());
    }
}
