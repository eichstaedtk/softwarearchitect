package de.eichstaedt.softwarearchitect.application;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ProjektSkizzeResourceTest {

    @Test
    public void testGetAllProjekte() {
        given()
          .when().get("/rest/projektskizze")
          .then()
             .statusCode(200)
             .body("name[0]",equalTo("Software Engineering Batchelor Course"));
    }

}