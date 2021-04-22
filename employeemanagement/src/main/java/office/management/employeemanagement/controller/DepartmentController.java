package office.management.employeemanagement.controller;

import office.management.employeemanagement.DAO.model.Department;
import office.management.employeemanagement.services.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "department")
public class DepartmentController {

        private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping(path = "/")
        public ResponseEntity<List<Department>> findAllDepartment(){
            List<Department> findAllDepartment= departmentService.findAllDepartment();
            return new ResponseEntity<>(findAllDepartment, HttpStatus.OK);
        }

        @GetMapping(path = "/{id}")
        public ResponseEntity<Department> findDepartmentById(@PathVariable("id") Integer id){
            Department findDepartmentByIds= departmentService.findDepartmentById(id);
            return new ResponseEntity<>(findDepartmentByIds, HttpStatus.OK);
        }

        @PostMapping(path = "/")
        public ResponseEntity<Department> addDepartment(@RequestBody Department department){
            Department addDepartment= departmentService.addDepartment(department);
            return new ResponseEntity<>(addDepartment, HttpStatus.CREATED);
        }
        @PutMapping(path = "/")
        public ResponseEntity<Department> updateDepartment(@RequestBody Department department){
            Department updateDepartment= departmentService.updateDepartment(department);
            return new ResponseEntity<>(updateDepartment, HttpStatus.OK);
        }

        @DeleteMapping(path = "/{id}")
        public ResponseEntity<?> deleteDepartmentById(@PathVariable("id") Integer id){
            departmentService.deleteDepartment(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    @GetMapping(path = "/count")
    public ResponseEntity countOfDepartment(){
        long countOfDepartment= departmentService.CountOfDepartment();
        return new ResponseEntity<>(countOfDepartment, HttpStatus.OK);
    }

    @GetMapping(path = "/groupOfDept")
    public ResponseEntity<List<Department>> groupOfDepartment(){
        List<Department> groupOfDepartment= (List<Department>) departmentService.groupOfDepartment();
        return new ResponseEntity<>(groupOfDepartment, HttpStatus.OK);
    }
}
