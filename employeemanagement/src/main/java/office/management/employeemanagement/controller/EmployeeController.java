package office.management.employeemanagement.controller;

import office.management.employeemanagement.DAO.model.Employee;
import office.management.employeemanagement.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "employee")
public class EmployeeController {
     private final EmployeeService employeeService;

@Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
}


    @GetMapping(path = "/")
    public ResponseEntity<List<Employee>> findAllEmployee(){
        List<Employee> findAllEmployee= employeeService.findAllEmployee();
        return new ResponseEntity<>(findAllEmployee, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Employee> findEmployeeById(@PathVariable("id") Integer id){
        Employee findEmployeeByIds= employeeService.findEmployeeById(id);
        return new ResponseEntity<>(findEmployeeByIds, HttpStatus.OK);
    }

    @PostMapping(path = "/")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee addEmployee= employeeService.addEmployee(employee);
        return new ResponseEntity<>(addEmployee, HttpStatus.CREATED);
    }

    @PutMapping(path = "/")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        Employee updateEmployee= employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }
//    @PutMapping(path = "/{pro_id}/updatefk/{emp_id}")
//    public Employee updateEmployeeDetails(@PathVariable("pro_id") Integer Project_Id,
//                                        @PathVariable("emp_id") Integer Emp_Id){
//        Project project= projectRepo.findById(Project_Id).get();
//        Employee employee=employeeRepo.findById(Emp_Id).get();
//        employee.projects(project);
//        return employee;
//    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> deleteEmployeeById(@PathVariable("id") Integer id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping(path = "/count")
    public ResponseEntity CountOfEmployee(){
        long countOfEmployee= employeeService.CountOfEmployee();
        return new ResponseEntity(countOfEmployee, HttpStatus.OK);
    }



    @GetMapping(path = "/groupOfEmpDept")
    public ResponseEntity<List<Object[]>> groupOfEmployeeDepartment(){
        List<Object[]> groupOfEmployeeDepartment=  employeeService.groupOfEmployeeDepartment();
        return new ResponseEntity<>(groupOfEmployeeDepartment, HttpStatus.OK);
    }


    @GetMapping(path = "/groupOfEmpPro")
    public ResponseEntity<List<Object[]>> groupOfEmpPro(){
        List<Object[]> groupOfEmpPro=  employeeService.groupOfEmpPro();
        return new ResponseEntity<>(groupOfEmpPro, HttpStatus.OK);
    }



    @GetMapping(path = "/empAllDetails")
    public ResponseEntity<List<Object[]>> EmpAllDetails(){
        List<Object[]>EmpAllDetails=  employeeService.EmpAllDetails();
        return new ResponseEntity<>(EmpAllDetails, HttpStatus.OK);
    }


    @GetMapping(path = "/Search")
    public ResponseEntity<List<Object[]>> AdvanceSearch(){
        List<Object[]> AdvanceSearch=  employeeService.AdvanceSearch();
        return new ResponseEntity<>(AdvanceSearch, HttpStatus.OK);
    }
}
