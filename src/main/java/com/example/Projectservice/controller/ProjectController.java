package com.example.Projectservice.controller;


import com.example.Projectservice.entity.Project;
import com.example.Projectservice.service.ProjectServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectServiceImp service;

    //post
    @PostMapping
    public ResponseEntity<Project> createProject(@RequestBody Project project){
        Project project1 = service.addProject(project);
        return new ResponseEntity<>(project1, HttpStatus.CREATED);
    }

    //get
    @GetMapping("/{id}")
    public ResponseEntity<Project> getProject(@PathVariable int id){
        Project projectById = service.getProjectById(id);
        return new ResponseEntity<>(projectById, HttpStatus.FOUND);
    }

    //getprojectByemployeeId
    @GetMapping("/employeeid/{employeeid}")
    public ResponseEntity<List<Project>> getProjectsByEmployeeId(@PathVariable int employeeid){
        List<Project> projectByEmployeeId = service.getProjectByEmployeeId(employeeid);
        return new ResponseEntity<>(projectByEmployeeId, HttpStatus.FOUND);
    }

    //GetAll
    @GetMapping
    public ResponseEntity<List<Project>> getAllProject(){
        List<Project> allProject = service.getAllProject();
        return new ResponseEntity<>(allProject, HttpStatus.OK);
    }

    //update
    @PutMapping("/{id}")
    public ResponseEntity<Project> updateProject(@PathVariable int id, @RequestBody Project project){
        Project project1 = service.updateProject(project,id);
        return new ResponseEntity<>(project1, HttpStatus.OK);
    }

    //delete
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable int id){
        service.deleteProject(id);
        return new ResponseEntity<>(Map.of("message","Project is deleted"),HttpStatus.NO_CONTENT);
    }


}
