package bondarenko;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "employees"
})
@XmlRootElement(name = "EmployeeNameResponse", namespace = "http://spring.io/guides/gs-producing-web-service")
public class EmployeeNameResponse {

    @XmlElement(name = "Students", namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected List<Employee> employees;

    public List<Employee> getEmployees() {
        if (employees == null) {
            employees = new ArrayList<Employee>();
        }
        return this.employees;
    }
}
