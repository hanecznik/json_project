package com.solvd.factory;

import com.solvd.Project;

public interface ProjectFactory {
    Project create(String name, String startDate);
}
