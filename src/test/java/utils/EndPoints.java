package utils;

public class EndPoints {
    public static final String GET_All_USERS = "index.php?/api/v2/get_users";
    public static final String GET_PROJECTS = "index.php?/api/v2/get_projects";
    public static final String GET_PROJECT = "index.php?/api/v2/get_project/{project_id}";
    public static final String ADD_PROJECT = "index.php?/api/v2/add_project";

    public static final String GET_REPORTS = "index.php?/api/v2/get_reports/{project_id}";
    public static final String GET_PLANS = "index.php?/api/v2/get_plans/{project_id}";

    public static final String GET_SUITES = "index.php?/api/v2/get_suites/{project_id}";
    public static final String ADD_SUITES = "index.php?/api/v2/add_suite/{project_id}";

}
