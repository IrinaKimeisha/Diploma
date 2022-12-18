package tests.api;

import baseEntities.BaseApiTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import models.Project;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import utils.EndPoints;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
@Epic("API TESTING")
@Feature("Project Tests")
public class ProjectApiTests extends BaseApiTest {

    private int projectId = 6;

    @Test(description = "Get all projects test")
    @Description("Get all projects test")
    public void getAllProjectsSimpleTest() {
        given()
                .when()
                .get(EndPoints.GET_PROJECTS)
                .then()
                .log().status()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test(description = "Add project test")
    @Description("Add project test")
    public void postProjectTest() {
        Project newProject = Project.builder()
                .name("API test")
                .announcement("Hi, I'm api test for your diploma ☺")
                .build();

        given()
                .body(String.format("{\n" +
                        "  \"name\": \"%s\"\n" +
                        "}", newProject.getName()))
                .when()
                .post(EndPoints.ADD_PROJECT)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);

    }

    @Test(description = "Get reports test")
    @Description("Get reports test")
    public void getReportsTest() {
        given()
                .when()
                .pathParam("project_id", projectId)
                .get(EndPoints.GET_REPORTS)
                .then()
                .log().status()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test(description = "Get exact project test")
    @Description("Get exact project test")
    public void getExactProject() {
        given()
                .pathParam("project_id", 4)
                .get(EndPoints.GET_PROJECT)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .body("id", is(4))
                .body("name", equalTo("testUI"));
    }

    @Test(description = "Get plans test")
    @Description("Get plans test")
    public void getPlansApiTest() {
        given()
                .when()
                .pathParam("project_id", projectId)
                .get(EndPoints.GET_PLANS)
                .then()
                .log().status()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }

}
