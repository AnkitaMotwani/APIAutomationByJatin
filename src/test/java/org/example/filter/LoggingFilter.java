package org.example.filter;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LoggingFilter implements Filter {

    private static final Logger logger = LogManager.getLogger(LoggingFilter.class);
    @Override
    public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec, FilterContext ctx) {
        logRequest(requestSpec);//capture logs
        Response response = ctx.next(requestSpec,responseSpec);//request is going to execute
        logResponse(response);
        return response; //release for assertion

    }

    public void logRequest(FilterableRequestSpecification requestSpec)
    {
        System.out.println("Ankita"+requestSpec.getHeaders());
        System.out.println("request: "+requestSpec.getBaseUri());
        System.out.println("filters request..................................");
        logger.info("request: "+requestSpec.request());
        logger.info(requestSpec.getMethod());
        logger.info("requestBody: "+requestSpec.getBody());
        logger.info("requestBody: "+requestSpec.getHeaders());
        logger.info("requestBody: "+requestSpec.getBasePath());

    }
    public void logResponse(Response response)
    {
        System.out.println("Motwani "+response.getBody().prettyPrint());
        System.out.println("response statusCode "+response.getStatusCode());
        System.out.println("filters response..................................");
        logger.info("responseBody "+response.getBody().prettyPrint());
        logger.info("response headers "+response.getHeaders());
        logger.info("response statusCode "+response.getStatusCode());
    }

}
