package com.factoriaf5.rps;

import static org.junit.Assert.assertEquals;

import com.factoriaf5.rps.app.Game;

import org.junit.Test;

public class GameTest {
    @Test
    public void test_game_player_2_wins(){
        //Given
        Game game = new Game();
        String expected = "Player 2 wins!";
        //When
        String result = game.startGame("p", "s");
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void test_game_player_1_wins(){
        //Given
        Game game = new Game();
        String expected = "Player 1 wins!";
        //When
        String result = game.startGame("r", "s");
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void test_game_draw(){
        //Given
        Game game = new Game();
        String expected = "Draw!";
        //When
        String result = game.startGame("p", "p");
        //Then
        assertEquals(expected, result);
    }

}
