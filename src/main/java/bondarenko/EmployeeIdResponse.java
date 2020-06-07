package bondarenko;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "employee"
})
@XmlRootElement(name = "EmployeeIdResponse", namespace = "http://spring.io/guides/gs-producing-web-service")
public class EmployeeIdResponse {

    @XmlElement(name = "Student", namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
