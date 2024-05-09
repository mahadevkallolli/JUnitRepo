//package com.thetechbull.junit.servicestest;
//
//import com.thetechbull.junit.service.CalculatorService;
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorServiceTest {
//    @Before
//    public void beforeEachTestCase(){
//        System.out.println("This is before every test case");
//    }
//    @After
//    public void afterEachTestCase(){
//        System.out.println("This is after every test case");
//    }
//
//    @BeforeClass
//    public static void init(){
//        System.out.println("Before all test execution");
//        System.out.println("Started executing test casess"+ new Date());
//    }
//
//   @AfterClass
//    public static void init2(){
//        System.out.println("After all test execution");
//        System.out.println("Started executing test casess"+ new Date());
//    }
//    //test method of addTwoNums
//    //@Test(timeout = 2000) we can specify time as well in the annotation
//    @Test(timeout = 2000)
//    public void addTwoNumsTest(){
//        System.out.println("To test addTwoNumsTest()");
//        int result=CalculatorService.addTwoNums(2,4);
//        int expected=6;
//        Assert.assertEquals(expected,result);
//        //actual result
//        //expected result
//    }
//
//    @Test
//    public  void productOfTwoNumsTest(){
//        System.out.println("To test productOfTwoNumsTest()");
//       int result= CalculatorService.productOfTwoNums(2,4);
//       int expected=8;
//       Assert.assertEquals(expected,result);
//    }
//
////    @Test
////    public void dividTwoNumsTest(){
////        double result =CalculatorService.dividTwoNums(20,2);
////        double expected=10;
////        Assert.assertEquals(expected,result);
////
////    }
//    @Test
//    public  void sumAnyNumTest(){
//        System.out.println("To test sumAnyNumTest()");
//       int result= CalculatorService.sumAnyNum(2,4,6,8);
//       int expectedResult=20;
//       Assert.assertEquals(expectedResult,result);
//    }
//
//}
