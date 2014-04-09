package principal;

import org.lwjgl.opengl.Display;

public class Fps {

	Main m;
	long frame = getTime();
	long lastFPS;
	int fps = 0;

	public Fps(Main m){
		this.m = m;
		getDelta();
		lastFPS = getTime();
	}

	public int getDelta() {
		long time = getTime();
		int delta = (int) (time - frame);
		frame = time;
		Display.sync(60);
		return delta;
	}

	public void updateFPS() {
		if (getTime() - lastFPS > 1000) {
			Display.setTitle("Proyecto Juego -- FPS: " + fps);
			fps = 0;
			lastFPS += 1000;
		}
		fps++;
	}

	public long getTime() {
		return System.nanoTime() / 1000000;
	}
}
