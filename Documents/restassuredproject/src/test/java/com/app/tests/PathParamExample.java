package com.app.tests;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PathParamExample {

    @BeforeClass
    public static void setUp(){
        RestAssured.baseURI="https://api.got.show/api";
    }

    @Test
    public void getCityByNameTest(){

        given().//preparing the request
                pathParams("name","Qarth").//by adding parameter 'name' with value 'Qarth'
                when().//sending the request
                get("/cities/{name}").//{name}->will be replaced by the value of the path parameters
                prettyPrint();

        // statement where we prepare the request
        given()
                // adding param 'name' with value 'Qarth'
                .pathParam("name", "Braavos").
                // send the request
                        when().
                // {name}  --> will be replaces by value of the path param
                        get("/cities/{name}").
                prettyPrint();
        //then --> verify the response
    }

    @Test
    public void getCharacterByName(){
        given().pathParams("name","Pyp").when().get("characters/{name}").prettyPrint();
    }

    @Test
    public void getCharacterById(){
        given().pathParams("id","56ffc5c00432440819385cfe").when().get("characters/byId/{id}").prettyPrint();
    }

}
