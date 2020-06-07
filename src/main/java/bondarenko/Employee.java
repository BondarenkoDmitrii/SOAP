package bondarenko;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employee", namespace = "http://spring.io/guides/gs-producing-web-service", propOrder = {
        "name",
        "salary",
        "id",
        "age"
})
public class Employee {

    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service", required = true)
    protected String name;

    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service")
    protected int salary;

    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service")
    protected String id;

    @XmlElement(namespace = "http://spring.io/guides/gs-producing-web-service")
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
