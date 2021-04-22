package office.management.employeemanagement.DAO.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "department")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    @Column(name = "Dept_Id")
    Integer id;

    @Column(name = "Name")
    String deptName;

    @Column(name = "Description")
    String deptDescription;

    @Column(name = "Location")
    String deptLocation;

    @Column(name = "Created_Date")
    String deptCreatedDate;

    @Column(name = "Created_By")
    String deptCreatedBy;

    @Column(name = "Updated_Date")
    String deptUpdatedDate;

    @Column(name = "Updated_By")
    String deptUpdatedBy;

    @Column(name = "Active")
    String deptActive;

    @OneToMany(mappedBy = "departments")
    Set<Employee> employees= new HashSet<>();

    public Department() {
    }

    public Department(Integer id, String deptName, String deptDescription, String deptLocation, String deptCreatedDate, String deptCreatedBy, String deptUpdatedDate, String deptUpdatedBy, String deptActive) {
        this.id = id;
        this.deptName = deptName;
        this.deptDescription = deptDescription;
        this.deptLocation = deptLocation;
        this.deptCreatedDate = deptCreatedDate;
        this.deptCreatedBy = deptCreatedBy;
        this.deptUpdatedDate = deptUpdatedDate;
        this.deptUpdatedBy = deptUpdatedBy;
        this.deptActive = deptActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptDescription() {
        return deptDescription;
    }

    public void setDeptDescription(String deptDescription) {
        this.deptDescription = deptDescription;
    }

    public String getDeptLocation() {
        return deptLocation;
    }

    public void setDeptLocation(String deptLocation) {
        this.deptLocation = deptLocation;
    }

    public String getDeptCreatedDate() {
        return deptCreatedDate;
    }

    public void setDeptCreatedDate(String deptCreatedDate) {
        this.deptCreatedDate = deptCreatedDate;
    }

    public String getDeptCreatedBy() {
        return deptCreatedBy;
    }

    public void setDeptCreatedBy(String deptCreatedBy) {
        this.deptCreatedBy = deptCreatedBy;
    }

    public String getDeptUpdatedDate() {
        return deptUpdatedDate;
    }

    public void setDeptUpdatedDate(String deptUpdatedDate) {
        this.deptUpdatedDate = deptUpdatedDate;
    }

    public String getDeptUpdatedBy() {
        return deptUpdatedBy;
    }

    public void setDeptUpdatedBy(String deptUpdatedBy) {
        this.deptUpdatedBy = deptUpdatedBy;
    }

    public String getDeptActive() {
        return deptActive;
    }

    public void setDeptActive(String deptActive) {
        this.deptActive = deptActive;
    }


    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                ", deptDescription='" + deptDescription + '\'' +
                ", deptLocation='" + deptLocation + '\'' +
                ", deptCreatedDate='" + deptCreatedDate + '\'' +
                ", deptCreatedBy='" + deptCreatedBy + '\'' +
                ", deptUpdatedDate='" + deptUpdatedDate + '\'' +
                ", deptUpdatedBy='" + deptUpdatedBy + '\'' +
                ", deptActive='" + deptActive + '\'' +
                '}';
    }
}
