package com.app.tests;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Homework {
    @BeforeClass
    public static void setup(){
        RestAssured.baseURI = "https://api.github.com";
    }

    @Test
    public void userTest(){
        // given --> prepare our request
        // submit it to url
        given().pathParam("username", "marufjont").
                when().get("/users/{username}").
                prettyPrint();

    }
}
