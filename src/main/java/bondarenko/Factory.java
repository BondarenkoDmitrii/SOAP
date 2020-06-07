package bondarenko;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class Factory {

    public Factory() {
    }

    public Employee createEmployee() {
        return new Employee();
    }

    public EmployeeIdRequest createEmployeeIdRequest() {
        return new EmployeeIdRequest();
    }

    public EmployeeIdResponse createEmployeeIdResponse() {
        return new EmployeeIdResponse();
    }

    public EmployeeNameRequest createEmployeeNameRequest() {
        return new EmployeeNameRequest();
    }

    public EmployeeNameResponse createEmployeeNameResponse() {
        return new EmployeeNameResponse();
    }
}