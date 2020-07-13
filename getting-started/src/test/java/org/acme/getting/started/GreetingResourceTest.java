package org.acme.getting.started;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import java.util.UUID;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.TestProfile;
import org.eclipse.microprofile.config.ConfigProvider;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
@TestProfile(GreetingResourceTestProfile.class)
@QuarkusTestResource(GreetingResourceTestResourceLifecycleManager.class)
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        System.out.println("config.arbitrary.sysprop:     " + ConfigProvider.getConfig().getValue("config.arbitrary.sysprop", String.class));
        System.out.println("config.arbitrary.codeprofile: " + ConfigProvider.getConfig().getValue("config.arbitrary.codeprofile", String.class));
        System.out.println("config.arbitrary.manager:     " + ConfigProvider.getConfig().getValue("config.arbitrary.manager", String.class));
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("hello"));
    }

    @Test
    public void testGreetingEndpoint() {
        String uuid = UUID.randomUUID().toString();
        given()
                .pathParam("name", uuid)
                .when().get("/hello/greeting/{name}")
                .then()
                .statusCode(200)
                .body(is("hello " + uuid));
    }

}
