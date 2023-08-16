package com.example.Projectservice.service;


import com.example.Projectservice.entity.Project;
import com.example.Projectservice.exception.ResourceNotFoundException;
import com.example.Projectservice.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImp implements ProjectService {

    @Autowired
    private ProjectRepo repo;

    @Override
    public Project getProjectById(int id) {
        Project project = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Project", "ID", id));
        return project;
    }

    @Override
    public List<Project> getAllProject() {
        List<Project> allProject = repo.findAll();
        return allProject;
    }

    @Override
    public Project addProject(Project project) {
        Project save = repo.save(project);
        return save;
    }

    @Override
    public Project updateProject(Project project, int id) {
        Project project1 = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Project", "ID", id));
        project1.setProjectName(project.getProjectName());
        Project save = repo.save(project1);
        return save;
    }

    @Override
    public void deleteProject(int id) {
      repo.deleteById(id);
    }

    @Override
    public List<Project> getProjectByEmployeeId(int employeeid) {
        List<Project> projectByEmployeeId = repo.findByEmployeeId(employeeid);
        return projectByEmployeeId;
    }
}
