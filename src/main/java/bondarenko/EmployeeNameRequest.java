package bondarenko;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name"
})
@XmlRootElement(name = "EmployeeNameRequest", namespace = "http://spring.io/guides/gs-producing-web-service")
public class EmployeeNameRequest {

    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service")
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
