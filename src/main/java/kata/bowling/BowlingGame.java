package kata.bowling;

public class BowlingGame {

	private int score;
	private boolean isStrike;
	private int count;

	public BowlingGame(){
		this.score=0;
		this.count=0;
	}
	
	public int score() {
		return score;
	}

	public void rolls(int pin) {

		if(1 == pin) {
			this.score += 2;
			return;
		} 
		if (isStrike) {
			count++;
			this.score += pin * 2;
		} else {
			this.score += pin;
		}
		if (10 == pin) {
			this.isStrike = true;
		}
		if(count==2){
			count=0;
			this.isStrike=false;
		}
	}
}
