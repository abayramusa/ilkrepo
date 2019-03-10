package com.app.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class WarmUpDay2 {
    /*
    WARM UP EXERCISE
EX 1.
 get all continents from the https://api.got.show/api
 verify continent "Westeros" exists in resutls
EX 2.
  get all episodes from the https://api.got.show/api
 verify episode "Rains of Castamere" exists in resutls
 Create a new class, and do both exercises in same class, different methods
     */

    /*
    Note: we usually verify 3 things: statuscode, metadata like row, oclums,..., and content
     */
    @BeforeClass
    public  static void setUpClass(){

        RestAssured.baseURI="https://api.got.show/api";

    }
    @Test
    public void continentsTest(){

        Response response = RestAssured.get("/continents");
        Assert.assertEquals(200,response.getStatusCode());
        response.prettyPrint();
        Assert.assertTrue(response.asString().contains("Westeros"));


    }
    @Test
    public void episodeTest(){

        Response response = RestAssured.get("/episodes/");
        Assert.assertEquals(200,response.getStatusCode());
        //  response.prettyPrint();
        Assert.assertTrue(response.asString().contains("Rains of Castamere"));


    }
}
