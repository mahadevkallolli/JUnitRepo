package com.thetechbull.junit.PracticeProgramsTest;

import com.thetechbull.junit.PracticePrograms.FrequencyOfEachEle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class FrequencyOfEachEleTest {

    @Test
    public void freqOfEachEleTest() {

        Map<Character, Long> actual = FrequencyOfEachEle.freqOfEachEle();
        Map<Character, Long> expectedmap = actual;

        Assertions.assertEquals(expectedmap,actual);


    }

}
