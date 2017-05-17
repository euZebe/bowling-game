package kata.bowling;

import static org.assertj.core.api.Assertions.*;
import static junit.framework.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

	private BowlingGame game;
	
	@Before
	public void init() {
		game = new BowlingGame();
	}
	
	@Test
	public void test() {
		//fail();
		assertThat(game.score()).isEqualTo(0);
	}
	
	@Test
	public void shouldReturn3ScoreWhen3PinsDown(){
		game.rolls(3);
		assertThat(game.score()).isEqualTo(3);
	}

	@Test
	public void shouldReturn7ScoreWhen3PinsDownThen4PinsDown(){
		game.rolls(3);
		game.rolls(4);
		assertThat(game.score()).isEqualTo(7);
	}	
	
	@Test
	public void shouldReturn12ScoreWhenSpareThen1PinsDown(){
		game.rolls(5);
		game.rolls(5);
		game.rolls(1);
		assertThat(game.score()).isEqualTo(12);
	}
	
	@Test
	public void shouldDoubleNextTwoRollsAfterAStrike(){
		game.rolls(10);
		game.rolls(7);
		game.rolls(2);
		assertThat(game.score()).isEqualTo(28);
	}
	
	@Test
	public void shouldNotDoubleTheThirdRollAfterStrike(){
		game.rolls(10);
		game.rolls(7);
		game.rolls(2);
		game.rolls(2);
		assertThat(game.score()).isEqualTo(30);
	}
}
