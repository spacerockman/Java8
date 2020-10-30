package java8.lambda;

import java8.lambda.model.Employee;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        Employee employee1 = new Employee(123,33,"male","dong","Huang");
        Employee employee2 = new Employee(2,22,"male","dong","Jin");
        Employee employee3 = new Employee(1,44,"male","dong","KONG");
        Employee employee4 = new Employee(3,55,"female","dong","MIKE");
        Employee employee5 = new Employee(4,66,"male","dong","X");
        Employee employee6 = new Employee(5,77,"male","dong","A");
        Employee employee7= new Employee(6,88,"male","dong","B");

        Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6,employee7).stream()
                .map(e -> {
                    e.setAge(e.getAge() + 1);
                    e.setGender(e.getGender().equals("male")? "female":"male");
                    return e;
                })
                .forEach(e -> System.out.println(e.toString()));

        //use peek
        Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6,employee7).stream()
                .peek(e -> {
                    e.setAge(e.getAge() + 1);
                    e.setGender(e.getGender().equals("male")? "female":"male");
                })
                .forEach(e -> System.out.println(e.toString()));

    }
}
