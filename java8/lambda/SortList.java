package java8.lambda;

import java8.lambda.model.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob","Dog","Flag","hooray","Apple");

        System.out.println(names);
        names.sort(Comparator.naturalOrder());
        System.out.println(names);


        Employee employee = new Employee(123,33,"male","dong","Huang");
        Employee employee2 = new Employee(2,22,"Female","dong","Jin");
        Employee employee3 = new Employee(1,44,"male","dong","KONG");
        Employee employee4 = new Employee(3,55,"Female","dong","MIKE");
        Employee employee5 = new Employee(4,66,"male","dong","X");
        Employee employee6 = new Employee(5,77,"Female","dong","A");
        Employee employee7= new Employee(6,88,"male","dong","B");

        List<Employee> employees = Arrays.asList(employee,employee2,employee3,employee4,employee5,employee6,employee7);

        employees.sort(
                Comparator.comparing(Employee::getGender).thenComparing(Employee::getAge)
                .reversed()
        );
        employees.forEach(System.out::println);
        System.out.println("======================");
        //rewrite the interface
        employees.sort((o1, o2)-> {
                if(o1.getAge() == o2.getAge()){
                    return 0;
                }
                return o1.getAge() - o2.getAge() >0? -1:1;
            }
        );
        employees.forEach(System.out::println);
    }
}
