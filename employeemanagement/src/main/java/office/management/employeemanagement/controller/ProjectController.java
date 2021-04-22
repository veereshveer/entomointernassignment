package office.management.employeemanagement.controller;

import office.management.employeemanagement.DAO.model.Project;
import office.management.employeemanagement.services.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "project" , method = RequestMethod.GET)
public class ProjectController {
private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping(path = "/")
    public ResponseEntity<List<Project>> findAllProject(){
        List<Project> findAllProjects= projectService.findAllProject();
        return new ResponseEntity<>(findAllProjects, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Project> findProjectById(@PathVariable("id") Integer id){
        Project findProjectByIds= projectService.findProjectById(id);
        return new ResponseEntity<>(findProjectByIds, HttpStatus.OK);
    }

    @PostMapping(path = "/")
    public ResponseEntity<Project> addProject(@RequestBody Project project){
        Project addProjects= projectService.addProject(project);
        return new ResponseEntity<>(addProjects, HttpStatus.CREATED);
    }
    @PutMapping(path = "/")
    public ResponseEntity<Project> updateProject(@RequestBody Project project){
        Project updateProjects= projectService.updateProject(project);
        return new ResponseEntity<>(updateProjects, HttpStatus.OK);
    }


    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> deleteProjectById(@PathVariable("id") Integer id){
      projectService.deleteProject(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping(path = "/count")
    public ResponseEntity countOfProject(){
        long countOfProjects= projectService.CountOfProject();
        return new ResponseEntity(countOfProjects, HttpStatus.OK);
    }
}
