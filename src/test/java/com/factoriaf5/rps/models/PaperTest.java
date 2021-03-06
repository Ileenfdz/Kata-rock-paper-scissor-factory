package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.factoriaf5.rps.domain.models.Paper;

import org.junit.Test;

public class PaperTest {

    @Test
    public void test_get_paper(){
        //Given
        Paper paper = new Paper();
        String expected = "p";
        //When
        paper.getName();
        //Then
        assertEquals( expected, paper.name );
    }

    @Test
    public void test_not_paper(){
        //Given
        Paper paper = new Paper();
        String expected = "r";
        //When
        paper.getName();
        //Then
        assertTrue( expected != paper.name );
    }
}
