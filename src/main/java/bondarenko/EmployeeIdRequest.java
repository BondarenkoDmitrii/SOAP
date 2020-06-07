package bondarenko;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id"
})
@XmlRootElement(name = "EmployeeIdRequest", namespace = "http://spring.io/guides/gs-producing-web-service")
public class EmployeeIdRequest {

    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service")
    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
