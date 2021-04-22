package office.management.employeemanagement.DAO.dao;

import office.management.employeemanagement.DAO.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepo extends JpaRepository <Employee, Integer> {

   Optional<Employee> findEmployeeById(Integer id);

    void deleteEmployeeById(Integer id);


    @Query(value = "select name as department_name, count(*) as 'count of employees' from department inner join employee on employee.dept_id = department.dept_id group by name;", nativeQuery = true)
    List<Object[]>groupOfEmployeeDepartment();

    @Query(value = "select name as project_name, count(*) as 'count of employees' from project inner join emp_relation on project.project_Id = emp_relation.project_Id inner join employee on employee.emp_Id = emp_relation.emp_Id group by name", nativeQuery = true )
    List<Object[]>groupOfEmpPro();

    @Query(value = "select employee.Full_Name,employee.Email, department.Name, project.name from employee join department on employee.Emp_Id = department.Dept_Id join project on department.Dept_Id = project.project_id", nativeQuery = true)
    List<Object[]> EmpAllDetail();

    @Query(value = "from Employee ")
    List<Object[]>AdvanceSearch();
}
