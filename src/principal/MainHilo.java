package principal;

import org.lwjgl.opengl.Display;

public class MainHilo implements Runnable {

	private Main m;
	
	public MainHilo (Main m){
		this.m = m;
	}
	@Override
	public void run() {
		while (!Display.isCloseRequested()) {
			Display.update();
			m.getInp().actu();
		}

	}

}
