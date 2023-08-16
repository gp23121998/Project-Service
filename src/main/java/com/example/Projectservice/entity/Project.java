package com.example.Projectservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Project_Table")
public class Project {
    @Id
    @Column(name="Project_ID")
    private int projectId;

    @Column(name="Employee_ID")
    private int employeeId;

    @Column(name="Project_Name")
    private String projectName;

}
