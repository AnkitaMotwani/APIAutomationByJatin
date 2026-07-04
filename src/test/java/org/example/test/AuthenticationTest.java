package org.example.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import org.example.base.AuthenticationService;
import org.example.models.request.Files;
import org.example.models.request.LoginRequest;
import org.example.models.request.sampleRequest;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.*;
@Listeners(org.example.listners.TestListeners.class)

public class AuthenticationTest {


//    String payload = "{username: \"AnkitaM240\", password: \"Mayur567\"}";
    Map<String,Object> m;
    @Test(description ="Verify if login ap is working")
    public void loginTest()
    {
        LoginRequest loginReq = new LoginRequest("AnkitaM240","Mayur567");

        AuthenticationService auth = new AuthenticationService();
        Response response = auth.login(loginReq);
        Assert.assertEquals(response.getStatusCode(),200);
//         m = response.as(new TypeRef<Map<String,Object>>(){
//        });
//        System.out.println(response.prettyPrint());
//        System.out.println(m.get("next_steps"));
//       Map<String,Object> map = ObjectMapper.readValue(r, Map.class);
    }
//    @Test(priority = 1)
//    public void newMethod()
//    {
//        System.out.println(m.get("message"));
//    }
    /**
    @Test(priority = 1)
    public void logMethod()
    {
        LoginRequest loginReq = new LoginRequest("AnkitaM240","Mayur567");
        AuthenticationService auth = new AuthenticationService();
        Response res=  auth.loginRe("post",loginReq);
        System.out.println(res.getStatusCode());
    }

    @Test(priority = 1)
    public void getLogin()
    {
        AuthenticationService auth = new AuthenticationService();
        Response res=  auth.loginget("get");
        System.out.println(res.getStatusCode());
    }
     **/
    @Test
    public void sampleTest()
    {
        Files files = new Files("file_abc","sampleFile.jpg","image/jpeg");

        List<Files> fileList = new ArrayList<>();
        fileList.add(files);
       sampleRequest sample = new sampleRequest.Builder().setEmail("ankita@gmail.com").setFiles(fileList).setFullName("Ankita Motwani").setUserName("AnkitaM").build();
        AuthenticationService auth = new AuthenticationService();
        Response res= auth.multiPartFilUpload(sample);
        m= res.as(new TypeRef<Map<String,Object>>(){

    });
//        System.out.println(res.prettyPrint());
        Assert.assertEquals(res.statusCode(),200);
    }


}
