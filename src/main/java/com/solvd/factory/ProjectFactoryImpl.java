package com.solvd.factory;

import com.solvd.Project;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectFactoryImpl implements ProjectFactory {

    @Override
    public Project create(String name, String startDate) {
        Project project = new Project();
        project.setProjectName(name);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse(startDate);
            project.setStartDate(date);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Invalid date format. Expected yyyy-MM-dd.");
        }

        return project;
    }
}