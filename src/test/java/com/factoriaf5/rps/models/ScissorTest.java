package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.factoriaf5.rps.domain.Scissor;

import org.junit.Test;

public class ScissorTest {
    
    @Test
    public void test_get_scissor(){
       //Given
       Scissor scissor = new Scissor();
       String expected = "scissor";
       //When
       scissor.getName();
       //Then
       assertEquals( expected, scissor.name );
    }

    @Test
    public void test_not_paper(){
        //Given
        Scissor scissor = new Scissor();
        String expected = "paper";
        //When
        scissor.getName();
        //Then
        assertTrue( expected != scissor.name );
    }
}
