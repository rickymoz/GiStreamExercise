public class Employee {
    private String employeeFirstName;
    private String employeeLastName;
    private Integer employeeAge;
    private String employeeDepartment;
    private Integer employeeYearsWorking;
    private Integer employeeSalary;

    public Employee(String employeeFirstName, String employeeLastName, Integer employeeAge, String employeeDepartment, Integer employeeYearsWorking, Integer employeeSalary) {
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeAge = employeeAge;
        this.employeeDepartment = employeeDepartment;
        this.employeeYearsWorking = employeeYearsWorking;
        this.employeeSalary = employeeSalary;
    }

    // GETTERS & SETTERS

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public Integer getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(Integer employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public Integer getEmployeeYearsWorking() {
        return employeeYearsWorking;
    }

    public void setEmployeeYearsWorking(Integer employeeYearsWorking) {
        this.employeeYearsWorking = employeeYearsWorking;
    }

    public Integer getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Integer employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
