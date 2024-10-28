package com.solvd.facade;

import com.solvd.Company;
import com.solvd.Manager;
import com.solvd.Project;

import java.util.List;

public class CompanyFacade {
    private final Company company;

    public CompanyFacade(Company company) {
        this.company = company;
    }

    public Manager getManager() {
        return company.getManager();
    }

    public List<Project> getProjects() {
        return company.getProjects();
    }
}
