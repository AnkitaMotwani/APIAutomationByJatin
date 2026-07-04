package org.example.base;

import com.fasterxml.jackson.core.JsonParser;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.example.filter.LoggingFilter;

import static io.restassured.RestAssured.*;
//baseService wrapper over RestAssured
//in selenium browser utility is wrapper over selenium
//RequestSpecification
//BaseURI

//creating the request
//handling the response

//   public static final String BASE_URI = "https://reqres.in/";

public class BaseService {


    public static final String BASE_URI = "https://swift.techwithjatin.com";
    // http://64.227.160.186:8080
    private RequestSpecification request;

    static {
        RestAssured.filters(new LoggingFilter());
    }
//    public BaseService() {
//        request = given().baseUri(BASE_URI);
//    }
    protected RequestSpecification requestSpec()
    {
        return RestAssured.given().baseUri(BASE_URI);
    }

    protected Response postRequest(Object payload, String endPoint) {
        return requestSpec().log().all().contentType(ContentType.JSON).body(payload).post(endPoint);
    }

    protected Response putRequest(Object payload, String endPoint) {
        return request.log().all().contentType(ContentType.JSON).body(payload).put(endPoint);
    }

    protected Response getRequest(String endPoint) {
        return request.log().all().contentType(ContentType.JSON).when().get(endPoint);
    }

    protected Response deleteRequest(Object payload, String endPoint) {
        return request.log().all().contentType(ContentType.JSON).body(payload).delete(endPoint);
    }


    protected Response requestMethod(String requestType, Object payload, String endPoint) {
        switch (requestType) {
            case "get":
                return request.log().all().contentType(ContentType.JSON).when().get(endPoint);

            case "post":
                return request.log().all().contentType(ContentType.JSON).body(payload).post(endPoint);
            default:
                return request.log().all().request(requestType);
        }
    }

//    public void getRequestBody()
//    {
//        JsonParser jsonParser =
//    }

}

