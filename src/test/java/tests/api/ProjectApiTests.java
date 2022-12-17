package tests.api;

import baseEntities.BaseApiTest;
import models.Project;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import utils.EndPoints;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ProjectApiTests extends BaseApiTest {

    private int projectId = 6;

    @Test(description = "Get all projects test")
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

    @Test
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

    @Test
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

    @Test
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
