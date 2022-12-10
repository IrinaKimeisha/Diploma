package tests.api;

import baseEntities.BaseApiTest;
import models.Suits;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import utils.EndPoints;

import static io.restassured.RestAssured.given;

public class SuitsApiTests extends BaseApiTest {
    private int projectId = 2;

    @Test(description = "Get all suits test")
    public void getSuitesTest() {
        given()
                .when()
                .pathParam("project_id", projectId)
                .get(EndPoints.GET_SUITES)
                .then()
                .log().status()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }

    @Test(description = "Add suits test")
    public void postSuiteTest() {
        Suits newSuits = Suits.builder()
                .name("Name of the suit ♠")
                .description("That is the description ♦")
                .build();

        given()
                .body(String.format("{\n" +
                        "  \"name\": \"%s\"\n" +
                        "}", newSuits.getName()))
                .when()
                .pathParam("project_id", projectId)
                .post(EndPoints.ADD_SUITES)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }
}
