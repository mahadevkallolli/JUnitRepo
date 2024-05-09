package com.thetechbull.junit.servicestest;

import com.thetechbull.junit.service.CalculatorService;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorServiceTest {

    //test method of addTwoNums
    @Test
    public void addTwoNumsTest(){

        int result=CalculatorService.addTwoNums(2,4);
        int expected=6;
        Assert.assertEquals(expected,result);
        //actual result

        //expected result
    }
}
