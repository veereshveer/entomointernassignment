package office.management.employeemanagement.DAO.dao;


import office.management.employeemanagement.DAO.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.Optional;

public interface DepartmentRepo extends JpaRepository <Department, Integer>{



    Optional<Department> findDepartmentById(Integer id);

    void deleteDepartmentById(Integer id);
    @Query(value = "from Department ")
    Collection<Department> countOfDepartment();
}
