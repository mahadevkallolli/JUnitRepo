package com.thetechbull.junit.servicestest;

import com.thetechbull.junit.service.CalculatorService;
import org.junit.jupiter.api.*;

import java.util.Date;

public class CalculatorServiceTestJUnit5 {

    @BeforeAll
    public static void beforeTest(){
        System.out.println("before test case execution..");
        System.out.println("time stamp is :"+new Date());
    }
    @AfterAll
    public static void afterTest(){
        System.out.println("After test case execution..");
        System.out.println("time stamp is :"+new Date());
    }

    @BeforeEach
    public  void beforeEachTest(){
        System.out.println("Before each test case execution......");
    }
    @AfterEach
    public  void afterEachTest(){
        System.out.println("After each test case execution......");
    }

    @Test
    @DisplayName("This is for addTwoNumsTest")
    public void addTwoNumsTest(){

        int actualResult=CalculatorService.addTwoNums(11,4);
        int expectedResult=15;
        Assertions.assertEquals(expectedResult,actualResult,"Test should fail if not matched");
        System.out.println("here 1st test case executed");
    }

    @Test
    @DisplayName("This is for sumAnyNumsTest")
    @Disabled
    public void sumAnyNumsTest(){
        int actualResult=CalculatorService.sumAnyNum(2,4,6);
        int expectedResult=12;
        Assertions.assertEquals(expectedResult,actualResult);
        System.out.println("here 2nd test case executed");
    }
}
