package com.solvd.builder;

import com.solvd.Company;
import com.solvd.Manager;
import com.solvd.Project;

import java.util.List;

public class CompanyBuilder {
    private Manager manager;
    private List<Project> projects;

    public CompanyBuilder setManager(Manager manager) {
        this.manager = manager;
        return this;
    }

    public CompanyBuilder setProjects(List<Project> projects) {
        this.projects = projects;
        return this;
    }

    public Company build() {
        Company company = new Company();
        company.setManager(manager);
        company.setProjects(projects);
        return company;
    }
}
