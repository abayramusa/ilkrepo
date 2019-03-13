package com.app.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class TestAssuredLoggingExample {
    @Test
    public void loggingTest(){
        //logging request
        //log-->provide logging options for request
        given().log().all().
                when().get("https://uinames.com/api/");

        //Log Response
        Response response = RestAssured.get("https://uinames.com/api/");
        response.then().log().all();




    }
}