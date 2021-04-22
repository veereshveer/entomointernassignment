package office.management.employeemanagement.DAO.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")

    @Column(name = "Project_Id",nullable = false,updatable = false)
    Integer id;

    @Column(name = "Project_Code")
    String proCode;

    @Column(name = "Name")
    String proName;

    @Column(name = "Description")
    String proDescription;

    @Column(name = "Created_Date")
    String proCreatedDate;

    @Column(name = "Created_By")
    String proCreatedBy;

    @Column(name = "Updated_Date")
    String proUpdatedDate;

    @Column(name = "Updated_By")
    String ProUpdatedBy;

    @Column(name = "Active")
    String proActive;

    @ManyToMany(mappedBy = "projects")
    Set<Employee> employees= new HashSet<>();

    public Project(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", proCode='" + proCode + '\'' +
                ", proName='" + proName + '\'' +
                ", proDescription='" + proDescription + '\'' +
                ", proCreatedDate='" + proCreatedDate + '\'' +
                ", proCreatedBy='" + proCreatedBy + '\'' +
                ", proUpdatedDate='" + proUpdatedDate + '\'' +
                ", ProUpdatedBy='" + ProUpdatedBy + '\'' +
                ", proActive='" + proActive + '\'' +
//                ", employees=" + employees +
                '}';
    }

//    @ManyToMany(mappedBy = "projects")
//    private List<Employee>employees;
//
//    public List<Employee> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(List<Employee> employees) {
//        this.employees = employees;
//    }

    public Project() {
    }

    public Project(Integer id, String proCode, String proName, String proDescription, String proCreatedDate, String proCreatedBy, String proUpdatedDate, String proUpdatedBy, String proActive) {
        this.id = id;
        this.proCode = proCode;
        this.proName = proName;
        this.proDescription = proDescription;
        this.proCreatedDate = proCreatedDate;
        this.proCreatedBy = proCreatedBy;
        this.proUpdatedDate = proUpdatedDate;
        this.ProUpdatedBy = proUpdatedBy;
        this.proActive = proActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProDescription() {
        return proDescription;
    }

    public void setProDescription(String proDescription) {
        this.proDescription = proDescription;
    }

    public String getProCreatedDate() {
        return proCreatedDate;
    }

    public void setProCreatedDate(String proCreatedDate) {
        this.proCreatedDate = proCreatedDate;
    }

    public String getProCreatedBy() {
        return proCreatedBy;
    }

    public void setProCreatedBy(String proCreatedBy) {
        this.proCreatedBy = proCreatedBy;
    }

    public String getProUpdatedDate() {
        return proUpdatedDate;
    }

    public void setProUpdatedDate(String proUpdatedDate) {
        this.proUpdatedDate = proUpdatedDate;
    }

    public String getProUpdatedBy() {
        return ProUpdatedBy;
    }

    public void setProUpdatedBy(String proUpdatedBy) {
        ProUpdatedBy = proUpdatedBy;
    }

    public String getProActive() {
        return proActive;
    }

    public void setProActive(String proActive) {
        this.proActive = proActive;
    }


}