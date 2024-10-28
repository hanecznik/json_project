package com.solvd.view;

import com.solvd.Company;
import com.solvd.Project;

public class CompanyView {
    public void displayCompanyDetails(Company company) {
        System.out.println("Company Details:");
        System.out.println("Manager: " + company.getManager().getName());
        System.out.println("Projects:");
        for (Project project : company.getProjects()) {
            System.out.println(" - " + project.getProjectName() + " (Start Date: " + project.getStartDate() + ")");
        }
    }
}
