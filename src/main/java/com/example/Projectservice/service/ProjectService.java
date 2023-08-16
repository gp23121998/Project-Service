package com.example.Projectservice.service;


import com.example.Projectservice.entity.Project;

import java.util.List;

public interface ProjectService {

    //getProjectById (get)
    public Project getProjectById(int id);

    public List<Project> getAllProject();

    //addProject (post)
    public Project addProject(Project project);

    //updateProject (put)
    public Project updateProject(Project project, int id);

    //deleteProject(delete)
    public void deleteProject(int id);

    List<Project> getProjectByEmployeeId(int employeeid);
}
