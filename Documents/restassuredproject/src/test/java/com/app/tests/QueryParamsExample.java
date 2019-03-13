package com.app.tests;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
For example , you would like to get list of brown color dining tables from below Url

//products/tables/diningtable?color=brown

@PathParam is used to match a part of the URL as a parameter.
 For example in an url of the form http://example.com/tables/{dinin...,
  you can use @PathParam("diningtable") to access diningtable entity class.

QueryParam is used to access key/value pairs in the query string of the URL (the part after the ?).
For example in the url http://example.com/ tables/ diningtable ? Color=brown,
 you can use @QueryParam("color") to get the value of color which is brown.
 */
public class QueryParamsExample {
    @BeforeClass
    public static void setUp(){
        RestAssured.baseURI="https://uinames.com/api/";
    }

    @Test
    public void testAmount(){
        given().queryParam("name","Ahmet").
                when().get().prettyPrint();
    }
}
