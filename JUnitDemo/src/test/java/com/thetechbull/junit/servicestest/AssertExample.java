package com.thetechbull.junit.servicestest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AssertExample {
    //Assertion is nothing but validating actual result with expected result
    //Assertions is a class
    @Test
   public void test1(){
       System.out.println("Testing some assertion methods");
       double actual=20.99;
       Double expected=20.99;
       //Overloaded methods
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Two arrays testing")
    public void test2(){
        System.out.println("Testing assertArrayEquals assertion methods");
        String[] actual={"mahadev","channappa","kallolli"};
        String[] expected={"mahadev","channappa","kallolli"};
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    @DisplayName("Two Objects testing")
    public void test3(){
        System.out.println("Testing 2 Objects ");
        String actual="mahadev";
        String expected="mahadev";
//        String s1=new String("mk");
//        String s2=new String("mk");
 //       Assertions.assertEquals(s2,s1);

        Assertions.assertSame(expected,actual);
    }
    @Test
    @DisplayName("Two Collections testing")
    public void test4(){
        System.out.println("Testing Collections Objects ");

        List<Integer> list1= Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> list2= Arrays.asList(1,2,3,4,5,6,7,8,9);

        Assertions.assertIterableEquals(list2,list1);
    }




}
