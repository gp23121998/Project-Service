package com.example.Projectservice.repository;

import com.example.Projectservice.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepo extends JpaRepository<Project,Integer> {
    public List<Project> findByEmployeeId(int employeeId);
}
