package java8.lambda;

import java8.lambda.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamAnyMatch {
    public static void main(String[] args) {

        Employee employee = new Employee(123,33,"male","dong","Huang");
        Employee employee2 = new Employee(2,22,"male","dong","Jin");
        Employee employee3 = new Employee(1,44,"male","dong","KONG");
        Employee employee4 = new Employee(3,55,"male","dong","MIKE");
        Employee employee5 = new Employee(4,66,"male","dong","X");
        Employee employee6 = new Employee(5,77,"male","dong","A");
        Employee employee7= new Employee(6,88,"male","dong","B");

        List<Employee> employees = Arrays.asList(employee,employee2,employee3,employee4,employee5,employee6,employee7);

        Boolean ageIsGreaterThan70 = false;
        ageIsGreaterThan70 = employees.stream().anyMatch(e -> e.getAge() > 70);
        System.out.println(ageIsGreaterThan70);

        ageIsGreaterThan70 = employees.stream().anyMatch(Employee.getAgeGreaterThan70);
        System.out.println(ageIsGreaterThan70);

        boolean ageIsGreaterThan10;
        ageIsGreaterThan10 = employees.stream().allMatch(Employee.getAgeGreaterThan40);
        System.out.println(ageIsGreaterThan10);

        Optional<Employee> optionalEmployee = employees.stream().filter(Employee.getAgeGreaterThan70)
                .findFirst();
        System.out.println(optionalEmployee.get());

        employees.stream().filter(Employee.getAgeGreaterThan70)
                .findFirst()
                .ifPresent(e -> System.out.println(e));

        Employee employeex = employees.stream().filter(e -> e.getAge()>90)
                .findAny()
                .orElse(new Employee(000,123,"male","test","Test"));
        System.out.println(employeex);

    }

}
