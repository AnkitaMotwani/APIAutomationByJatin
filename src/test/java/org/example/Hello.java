package org.example;

import io.restassured.response.*;
import org.testng.annotations.*;

import static io.restassured.RestAssured.*;
@Listeners(org.example.listners.TestListeners.class)
public class Hello {
//in order to test api we have to add a restassured liabrary
    //RestAssured is a class but no need to create an object as all the variables and methods are static in nature, it is a utility class
    //utility class is a class in which all the variables and methods are going to be static in nature
    //Arrays is also utility class no need to create object, Math
    // utility class contains resuable components

    //whenever u are class which is having static methods we can use static import help imporve readability

//    public static void main(String[] args) {
//        System.out.println("Hello");
//    }

//    @Test
//    public void login() {
//        RestAssured.baseURI = "http://64.227.160.186:8080";
//        Response response = RestAssured.given().header("Content-Type", "application/json")
////                .contentType("application/json")
////                .header("Authrization","Bearear eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJBbmtpdGFNMjQwIiwiaWF0IjoxNzgyMjM0NTUzLCJleHAiOjE3ODIyMzgxNTN9.g_h0F75Le8hc6ZQQKz3JqdT_zfVs8IO5E3fb7aaL-L8").
//                .body("{username: \"AnkitaM240\", password: \"Mayur567\"}").log().all()
//                .when().
//                post("/api/auth/login");
//        String res = response.prettyPrint();
////        System.out.println(res);
//        System.out.println(response.getStatusCode());
//    }


@Test(description = "verify if login api is working")
public void login() {
//    baseURI = "http://64.227.160.186:8080";
    Response response =given().baseUri("http://64.227.160.186:8080").header("Content-Type", "application/json")
            .body("{username: \"AnkitaM240\", password: \"Mayur567\"}").log().all()
            .when().
            post("/api/auth/login");
    String res = response.prettyPrint();
//        System.out.println(res);
    System.out.println(response.getStatusCode());
}
}
