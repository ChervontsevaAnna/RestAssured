import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class TestGet {
    @Test
    public void GetUsers(){
                given()
                .baseUri("https://reqres.in")
                .contentType(ContentType.JSON)
                .when().get("/api/users")
                .then().statusCode(200);


    }

}
