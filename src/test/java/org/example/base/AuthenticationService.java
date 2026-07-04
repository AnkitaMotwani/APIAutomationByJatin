package org.example.base;

import io.restassured.response.Response;
import org.example.models.request.LoginRequest;

public class AuthenticationService extends BaseService {

//    public static final String BASE_PATH = "api/collections/products";
     public static final String BASE_PATH = "/api/auth/";

    public Response login(LoginRequest payload)
    {
       return postRequest(payload,BASE_PATH+"login");
    }
//    public Response loginRe(String requestType,LoginRequest payload)
//    {
//         return requestMethod(requestType,payload,BASE_PATH+"login");
//    }
//    public Response loginget(String requestType)
//    {
//        return requestMethod(requestType,"",BASE_PATH+"login");
//    }

    public Response multiPartFilUpload(Object payload)
    {
        return postRequest(payload,"https://echo.free.beeceptor.com/");

    }
}
