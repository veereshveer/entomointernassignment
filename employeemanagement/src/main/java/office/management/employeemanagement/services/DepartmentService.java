package office.management.employeemanagement.services;

import office.management.employeemanagement.DAO.dao.DepartmentRepo;
import office.management.employeemanagement.DAO.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DepartmentService {
    private final DepartmentRepo departmentRepo;
@Autowired
    public DepartmentService(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }


    public Department addDepartment(Department department){
        return departmentRepo.save(department);
    }
    public List<Department> findAllDepartment(){
        return departmentRepo.findAll();
    }
    public Department updateDepartment(Department department){
        return departmentRepo.save(department);
    }
    public Department findDepartmentById(Integer id){
        return departmentRepo.getOne(id);
    }
    public void deleteDepartment(Integer id){
        departmentRepo.deleteDepartmentById(id);
    }

    public long CountOfDepartment() {
        return departmentRepo.count();
    }

    public List<Department> groupOfDepartment() {
    return (List<Department>) departmentRepo.countOfDepartment();
    }
}
