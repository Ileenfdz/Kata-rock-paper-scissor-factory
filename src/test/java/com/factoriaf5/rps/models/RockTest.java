package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.factoriaf5.rps.domain.Rock;

import org.junit.Test;

public class RockTest {

    @Test
    public void test_get_rock(){
        //Given
        Rock rock = new Rock();
        String expected = "rock";
        //When
        rock.getName();
        //Then
        assertEquals( expected, rock.name );
    }

    @Test
    public void test_not_rock(){
        //Given
        Rock rock = new Rock();
        String expected = "paper";
        //When
        rock.getName();
        //Then
        assertTrue( expected != rock.name );
    }
}
