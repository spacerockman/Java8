package java8.lambda;

import java8.lambda.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,34,5,6,7);
        Integer num1 = numbers.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println(num1);
        Integer total = numbers.stream().reduce(0,Integer::sum);
        System.out.println(total);


        //String
        List<String> names = Arrays.asList("1","2","34","5","6","sds");
        String nameContacted = names.stream()
                .reduce("",(a,b)->a.concat(b));
        System.out.println(nameContacted);

        Employee employee = new Employee(123,33,"male","dong","Huang");
        Employee employee2 = new Employee(2,22,"male","dong","Jin");
        Employee employee3 = new Employee(1,44,"male","dong","KONG");
        Employee employee4 = new Employee(3,55,"male","dong","MIKE");
        Employee employee5 = new Employee(4,66,"male","dong","X");
        Employee employee6 = new Employee(5,77,"male","dong","A");
        Employee employee7= new Employee(6,88,"male","dong","B");

        List<Employee> employees = Arrays.asList(employee,employee2,employee3,employee4,employee5,employee6,employee7);
        Integer ageTotal = employees.parallelStream()
                .map(e -> e.getAge())
                .reduce(0,(a, b) -> a + b,Integer::sum);
        System.out.println(ageTotal);


    }
}

