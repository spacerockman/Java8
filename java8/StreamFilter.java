package java8;

import java8.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter{
    public static void main(String[] args) {

        Employee employee = new Employee(123,33,"male","dong","Huang");
        Employee employee2 = new Employee(2,22,"male","dong","Jin");
        Employee employee3 = new Employee(1,44,"male","dong","KONG");
        Employee employee4 = new Employee(3,55,"male","dong","MIKE");
        Employee employee5 = new Employee(4,66,"male","dong","X");
        Employee employee6 = new Employee(5,77,"male","dong","A");
        Employee employee7= new Employee(6,88,"male","dong","B");

        Arrays.asList(employee,employee2,employee3,employee4,employee5,employee6,employee7).stream()
                .filter(e -> e.getAge() >33 && e.getFirstName().contains("d"))
                .forEach(string ->{
                    System.out.println(string.toString());
                });
    }
}