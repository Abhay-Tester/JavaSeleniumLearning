package ApiTesting;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;
public class GetUser {

	 @Test
	    public void getUserTest() {

	        given()
	        .when()
	            .get("https://reqres.in/api/users/2")
	        .then()
	            .statusCode(200)
	            .body("data.id", equalTo(2));
	    }
}
