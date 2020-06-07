package bondarenko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EmployeeEndpoint {

    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeEndpoint(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "EmployeeNameRequest")
    @ResponsePayload
    public EmployeeNameResponse getEmployeeByName(@RequestPayload EmployeeNameRequest request) {
        EmployeeNameResponse response = new EmployeeNameResponse();
        response.employees = employeeRepository.findEmployeeByName(request.getName());

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "EmployeeIdRequest")
    @ResponsePayload
    public EmployeeIdResponse getEmployeeById(@RequestPayload EmployeeIdRequest request) {
        EmployeeIdResponse response = new EmployeeIdResponse();
        response.setEmployee(employeeRepository.findEmployeeById(request.getId()));

        return response;
    }
}
