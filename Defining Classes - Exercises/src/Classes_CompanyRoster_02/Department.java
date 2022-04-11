package Classes_CompanyRoster_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employeeList;

    public Department() {
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return Collections.unmodifiableList(this.employeeList);
    }

    public double getAverageSalary() {
        double averageSalary = 0.0;
        for (Employee employee : this.employeeList) {
            averageSalary += employee.getSalary();
        }

        return averageSalary / this.employeeList.size();
    }
}
