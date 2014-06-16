package atEngine;

public class Sample {
	private Game game;
	public Sample() {
		game = new Game(800, 600, "Sample Game");
		game.getScreenFactory().showScreen(new SampleScreen(game.getScreenFactory()));
	}
	public static void main(String[] args) {
		new Sample();
	}
}