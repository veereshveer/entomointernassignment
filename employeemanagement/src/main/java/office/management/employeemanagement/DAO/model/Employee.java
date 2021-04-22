package office.management.employeemanagement.DAO.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "employee")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    @Column(name = "Emp_Id")
    Integer id;

    @Column(name = "Emp_Code")
    String empCode;

    @Column(name = "Full_Name")
    String empFullName;

    @Column(name = "Email")
    String empEmail;

    @Column(name = "Emp_join_date")
    String empJoinDate;

    @Column(name = "Created_Date")
    String empCreatedDate;

    @Column(name = "Created_By")
    String empCreatedBy;

    @Column(name = "Updated_Date")
    String empUpdatedDate;

    @Column(name = "Updated_By")
    String empUpdatedBy;

    @ManyToOne
    private Department departments;

    @Column(name = "Active")
    String empActive;


    @ManyToMany
    @JoinTable(
            name = "emp_relation",
            joinColumns = { @JoinColumn(name = "Emp_Id") },
            inverseJoinColumns = { @JoinColumn(name = "Project_Id") }
    )
    Set<Project> projects= new HashSet<>();


    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    // public void addDetails(Project project){
//    project.add(project);
//
//}

    public Employee() {
    }

    public Employee(Integer id, String empCode, String empFullName, String empEmail, String empJoinDate, String empCreatedDate, String empCreatedBy, String empUpdatedDate, String empUpdatedBy, Department departments, String empActive) {
        this.id = id;
        this.empCode = empCode;
        this.empFullName = empFullName;
        this.empEmail = empEmail;
        this.empJoinDate = empJoinDate;
        this.empCreatedDate = empCreatedDate;
        this.empCreatedBy = empCreatedBy;
        this.empUpdatedDate = empUpdatedDate;
        this.empUpdatedBy = empUpdatedBy;
        this.departments = departments;
        this.empActive = empActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getEmpFullName() {
        return empFullName;
    }

    public void setEmpFullName(String empFullName) {
        this.empFullName = empFullName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpJoinDate() {
        return empJoinDate;
    }

    public void setEmpJoinDate(String empJoinDate) {
        this.empJoinDate = empJoinDate;
    }

    public String getEmpCreatedDate() {
        return empCreatedDate;
    }

    public void setEmpCreatedDate(String empCreatedDate) {
        this.empCreatedDate = empCreatedDate;
    }

    public String getEmpCreatedBy() {
        return empCreatedBy;
    }

    public void setEmpCreatedBy(String empCreatedBy) {
        this.empCreatedBy = empCreatedBy;
    }

    public String getEmpUpdatedDate() {
        return empUpdatedDate;
    }

    public void setEmpUpdatedDate(String empUpdatedDate) {
        this.empUpdatedDate = empUpdatedDate;
    }

    public String getEmpUpdatedBy() {
        return empUpdatedBy;
    }

    public void setEmpUpdatedBy(String empUpdatedBy) {
        this.empUpdatedBy = empUpdatedBy;
    }

    public Department getDepartments() {
        return departments;
    }

    public void setDepartments(Department departments) {
        this.departments = departments;
    }

    public String getEmpActive() {
        return empActive;
    }

    public void setEmpActive(String empActive) {
        this.empActive = empActive;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empCode='" + empCode + '\'' +
                ", empFullName='" + empFullName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empJoinDate='" + empJoinDate + '\'' +
                ", empCreatedDate='" + empCreatedDate + '\'' +
                ", empCreatedBy='" + empCreatedBy + '\'' +
                ", empUpdatedDate='" + empUpdatedDate + '\'' +
                ", empUpdatedBy='" + empUpdatedBy + '\'' +
                ", departments=" + departments +
                ", empActive='" + empActive + '\'' +
                '}';
    }
}
