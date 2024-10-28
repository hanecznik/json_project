package com.solvd;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.Company;
import com.solvd.Project;

import java.io.File;
import java.io.IOException;

public class JsonParser {

    public Company parseJson(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(filePath), Company.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

//    public static void main(String[] args) {
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        try {
//            Company company = objectMapper.readValue(new File("src/main/resources/data.json"), Company.class);
//
//            System.out.println("Manager: " + company.getManager().getName());
//            System.out.println("Projects:");
//            for (Project project : company.getProjects()) {
//                System.out.println(" - " + project.getProjectName() + " (Start Date: " + project.getStartDate() + ")");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
