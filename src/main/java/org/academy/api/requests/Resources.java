package org.academy.api.requests;

import org.academy.MainConfig;

public class Resources extends MainConfig {
    public static String prefixResource() {
        return read("rs.prefix");
    }

    public static String allUsersResource() {
        return read("rs.all_users");
    }

    public static String allSuitesResource() {
        return read("rs.all_suites");
    }

    public static String allCasesResource() {
        return read("rs.all_cases");
    }

    public static String addProjectResource() {
        return read("rs.add_project");
    }

    public static String getProjectResource() {
        return read("rs.get_project").concat("9");
    }

    public static String getProjectsResource() {
        return read("rs.get_projects");
    }

    public static String updateProjectResource(int id) {
        return read("rs.update_project").concat(String.valueOf(id));
    }

    public static String addCaseResource() {
        return read("rs.add_case");
    }

    public static String getCaseResourse() {
        return read("rs.get_case");
    }

    public static String addPlanResource() {
        return read("rs.add_plan");
    }

    public static String getPlanResource() {
        return read("rs.get_plan");
    }

    public static String deleteProjectResource() {
        return read("rs.delete_project");
    }
}
