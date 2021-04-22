package office.management.employeemanagement.DAO.dao;

import office.management.employeemanagement.DAO.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProjectRepo extends JpaRepository<Project,Integer> {


    void deleteProjectById(Integer id);

    Optional <Project> findProjectById(Integer id);
}
