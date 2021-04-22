package office.management.employeemanagement.services;

import office.management.employeemanagement.DAO.dao.ProjectRepo;
import office.management.employeemanagement.DAO.model.Project;
import office.management.employeemanagement.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProjectService {
    private final ProjectRepo projectRepo;
@Autowired
    public ProjectService(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }




    public Project addProject(Project project){

    return projectRepo.save(project);
}
public List<Project> findAllProject(){
    return projectRepo.findAll();
}
public Project updateProject(Project project){
    return projectRepo.save(project);
}
public Project findProjectById(Integer id){
    return projectRepo.findProjectById(id).orElseThrow(() -> new UserNotFoundException("User by id "+id+" not fund"));
}
public void deleteProject(Integer id){
    projectRepo.deleteProjectById(id);
}

    public long CountOfProject() {
        return projectRepo.count();
    }
}
