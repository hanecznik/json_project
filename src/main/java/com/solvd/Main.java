package com.solvd;

import com.solvd.builder.CompanyBuilder;
import com.solvd.controller.CompanyController;
import com.solvd.controller.PersonController;
import com.solvd.decorator.PersonDecorator;
import com.solvd.facade.CompanyFacade;
import com.solvd.factory.AbstractFactory;
import com.solvd.factory.PersonFactoryImpl;
import com.solvd.factory.ProjectFactoryImpl;
import com.solvd.strategy.PersonProcessingStrategy;
import com.solvd.strategy.SimplePersonStrategy;
import com.solvd.strategy.DetailedPersonStrategy;
import com.solvd.view.CompanyView;
import com.solvd.view.PersonView;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        JsonParser parser = new JsonParser();
        Company company = parser.parseJson("src/main/resources/data.json");

        if (company == null) {
            System.out.println("Error parsing JSON data.");
            return;
        }

            AbstractFactory<Person> personFactory = new PersonFactoryImpl();

            Manager manager = (Manager) personFactory.create("manager");
            manager.setName("John Smith");
            manager.setAge(45);
            manager.setDepartment("Engineering");
            manager.setSalary(120000);


        List<Project> projects = Arrays.asList(
                new Project(),
                new Project()
        );
        CompanyBuilder companyBuilder = new CompanyBuilder()
                .setManager(manager)
                .setProjects(projects);
        Company builtCompany = companyBuilder.build();

        CompanyFacade companyFacade = new CompanyFacade(builtCompany);
        System.out.println("Facade Pattern:");
        System.out.println("Manager: " + companyFacade.getManager().getName());
        System.out.println("Projects: " + companyFacade.getProjects().size() + " projects available.\n");

        PersonDecorator decoratedPerson = new PersonDecorator(manager);
        System.out.println("Decorator Pattern:");
        System.out.println("Decorated Manager's Name: " + decoratedPerson.getDecoratedName() + "\n");

        PersonProcessingStrategy simpleStrategy = new SimplePersonStrategy();
        PersonProcessingStrategy detailedStrategy = new DetailedPersonStrategy();

        System.out.println("Strategy Pattern:");
        System.out.println("Using Simple Strategy:");
        simpleStrategy.process(manager);

        System.out.println("Using Detailed Strategy:");
        detailedStrategy.process(manager);
        System.out.println();

        PersonView personView = new PersonView();
        CompanyView companyView = new CompanyView();

        PersonController personController = new PersonController(manager, personView);
        CompanyController companyController = new CompanyController(builtCompany, companyView);

        System.out.println("MVC Pattern:");
        System.out.println("Displaying Manager Details:");
        personController.displayPerson();

        System.out.println("\nDisplaying Company Details:");
        companyController.displayCompany();

        personController.updatePersonName("Jane Doe");
        System.out.println("\nAfter updating Manager's name:");
        personController.displayPerson();
    }
}
