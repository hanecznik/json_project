package com.solvd.controller;

import com.solvd.Company;
import com.solvd.view.CompanyView;

public class CompanyController {
    private final Company model;
    private final CompanyView view;

    public CompanyController(Company model, CompanyView view) {
        this.model = model;
        this.view = view;
    }

    public void updateManagerName(String name) {
        model.getManager().setName(name);
    }

    public void displayCompany() {
        view.displayCompanyDetails(model);
    }
}
