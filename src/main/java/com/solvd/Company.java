package com.solvd;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Company {
    private Manager manager;
    private List<Project> projects;

    public Manager getManager() { return manager; }
    public void setManager(Manager manager) { this.manager = manager; }

    public List<Project> getProjects() { return projects; }
    public void setProjects(List<Project> projects) { this.projects = projects; }
}