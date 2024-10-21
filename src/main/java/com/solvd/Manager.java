package com.solvd;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Manager extends Employee {
    private List<String> projects;

    public List<String> getProjects() { return projects; }
    public void setProjects(List<String> projects) { this.projects = projects; }
}
