package com.factoriaf5.rps;

import static org.junit.Assert.assertEquals;

import com.factoriaf5.rps.infrastructure.Game;
import com.factoriaf5.rps.domain.Paper;
import com.factoriaf5.rps.domain.Rock;
import com.factoriaf5.rps.domain.Scissor;

import org.junit.Test;

public class GameTest {
    @Test
    public void test_game_rock_scissor(){
        //Given
        Game game = new Game();
        Rock rock = new Rock();
        Scissor scissor = new Scissor();
        String expected = "Player 1 wins!";
        //When
        String winner = game.startGame(rock.name, scissor.name);
        //Then
        assertEquals( expected, winner );
    }

    @Test
    public void test_game_draw_rocks(){
        //Given
        Game game = new Game();
        Rock rock = new Rock();
        Rock rock2 = new Rock();
        String expected = "Draw!";
        //When
        String winner = game.startGame(rock.name,rock2.name);
        //Then
        assertEquals( expected, winner );
    }

    @Test
    public void test_game_paper_rock(){
        //Given
        Game game = new Game();
        Paper paper = new Paper();
        Rock rock = new Rock();
        String expected = "Player 1 wins!";
        //When
        String winner = game.startGame(paper.name,rock.name);
        //Then
        assertEquals( expected, winner );
    }

    @Test
    public void test_game_paper_scissor(){
        //Given
        Game game = new Game();
        Paper paper = new Paper();
        Scissor scissor = new Scissor();
        String expected = "Player 2 wins!";
        //When
        String winner = game.startGame(paper.name,scissor.name);
        //Then
        assertEquals( expected, winner );
    }
}
