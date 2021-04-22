package office.management.employeemanagement.services;

import office.management.employeemanagement.DAO.dao.EmployeeRepo;
import office.management.employeemanagement.DAO.model.Employee;
import office.management.employeemanagement.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional

public class EmployeeService {
    private final EmployeeRepo employeeRepo;
    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    public Employee addEmployee(Employee employee){
        return employeeRepo.save(employee);
    }
    public List<Employee> findAllEmployee(){
        return employeeRepo.findAll();
    }
    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }
    public Employee findEmployeeById(Integer id){
        return employeeRepo.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("User by id "+id+" not fund"));
    }
    public void deleteEmployee(Integer id){
        employeeRepo.deleteEmployeeById(id);
    }

    public long CountOfEmployee() {
        return employeeRepo.count();
    }

    public  List<Object[]>  groupOfEmployeeDepartment() {
            return (List<Object[]>) employeeRepo.groupOfEmployeeDepartment();
    }

    public List<Object[]> groupOfEmpPro() {
        return (List<Object[]>) employeeRepo.groupOfEmpPro();

    }

    public List<Object[]> EmpAllDetails() {
        return (List<Object[]>) employeeRepo.EmpAllDetail();

    }

    public List<Object[]> AdvanceSearch() {
        return (List<Object[]>) employeeRepo.AdvanceSearch();

    }
}
