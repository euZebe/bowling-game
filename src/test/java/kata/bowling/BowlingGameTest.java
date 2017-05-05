package kata.bowling;

import static org.assertj.core.api.Assertions.*;

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
		assertThat(game).isNull();
	}

}
