package org.example.listners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {
  private static final Logger logger = LogManager.getLogger(TestListeners.class);
    public void onStart(ITestContext context) {
       logger.info("Test started");
    }

    public void onFinish(ITestContext context) {
        logger.info("Test suite completed");
    }

    public void onTestStart(ITestResult result) {
      logger.info("started!! "+result.getMethod().getMethodName());
      logger.info("description!! "+result.getMethod().getDescription());

    }
    public void onTestSuccess(ITestResult result) {
        logger.info("success!! "+result.getMethod().getMethodName());

    }

    public void onTestFailure(ITestResult result) {
        logger.error("failed!! "+result.getMethod().getMethodName());

    }
}
