package bondarenko;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeRepository {

    private static final List<Employee> employees = new ArrayList<Employee>();

    @PostConstruct
    public void initData() {

        Employee one = new Employee();
        one.setName("Dima");
        one.setSalary(7000);
        one.setId("001");
        one.setAge(30);
        employees.add(one);

        Employee two = new Employee();
        two.setName("Vika");
        two.setSalary(8200);
        two.setId("002");
        two.setAge(27);
        employees.add(two);

        Employee three = new Employee();
        three.setName("Keks");
        three.setSalary(7500);
        three.setId("003");
        three.setAge(33);
        employees.add(three);

        Employee four = new Employee();
        four.setName("Dima");
        four.setSalary(8000);
        four.setId("004");
        four.setAge(25);
        employees.add(four);

    }

    public List<Employee> findEmployeeByName(String name) {
        Assert.notNull(name, "Name must not be null");

        List<Employee> result = new ArrayList<>();

        for (Employee employee : employees) {
            if (name.equals(employee.getName())) {
                result.add(employee);
            }
        }

        return result;
    }

    public Employee findEmployeeById(String id) {
        Assert.notNull(id, "Id must not be null");

        Employee result = null;

        for (Employee employee : employees) {
            if (id.equals(employee.getId())) {
                result = employee;
            }
        }

        return result;
    }
}
