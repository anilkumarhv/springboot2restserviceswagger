package in.anil.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@ApiModel(description="All details about the student. ")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlElement
    private Long id;

    @ApiModelProperty(notes="Name should have atleast 2 characters")
    @Size(min=2, message="Name should have atleast 2 characters")
    @XmlElement
    private String name;

    @ApiModelProperty(notes="Name should have atleast 2 characters")
    @Size(min=10, max = 12, message="Name should have atleast 2 characters")
    @XmlElement
    private String phoneNumber;

    public Student() {
        super();
    }

    public Student(Long id, String name, String phoneNumber) {
        super();
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
