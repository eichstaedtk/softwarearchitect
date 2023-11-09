package de.eichstaedt.softwarearchitect.ui;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ProjektResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/projects")
          .then()
             .statusCode(200)
             .body("name[0]",equalTo("Software Engineering Batchelor Course"));
    }

}