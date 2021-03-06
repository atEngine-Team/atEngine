package atEngine;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class SampleScreen extends Screen {
	private int x = 0, y = 0;
	public SampleScreen(ScreenFactory screenFactory) {
		super(screenFactory);
	}

	@Override
	public void onCreate() {
		System.out.println("Creating...");
	}

	@Override
	public void onUpdate() {
		if(getScreenFactory().getGame().getKeyboardListener().isKeyPressed(KeyEvent.VK_A)) {
			x -= 2;
		}
		if(getScreenFactory().getGame().getKeyboardListener().isKeyPressed(KeyEvent.VK_D)) {
			x += 2;
		}
		if(getScreenFactory().getGame().getKeyboardListener().isKeyPressed(KeyEvent.VK_W)) {
			y -= 2;
		}
		if(getScreenFactory().getGame().getKeyboardListener().isKeyPressed(KeyEvent.VK_S)) {
			y += 2;
		}
	}

	@Override
	public void onDraw(Graphics2D g2d) {
		g2d.setColor(Color.GRAY);
		g2d.fillOval(x, y, 64, 64);
	}
}