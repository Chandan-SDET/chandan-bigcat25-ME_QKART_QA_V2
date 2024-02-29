package QKART_TESTNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener{
    @Override
    public void onTestStart(ITestResult result){
         System.out.println("The screen shot taken on tc start"+ result.getName());
         QKART_Tests.takeScreenshot("START Test", result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result){

        System.out.println("The screen shot taken on tc success"+ result.getName());
         QKART_Tests.takeScreenshot(" Test Success", result.getName());
    }


    @Override
    public void onTestFailure(ITestResult result){

        System.out.println("The screen shot taken on tc failure"+ result.getName());
         QKART_Tests.takeScreenshot(" Test Failure", result.getName());
    }



}