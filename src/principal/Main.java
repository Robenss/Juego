package principal;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import acciones.InputHandler;

public class Main {

	private InputHandler inp = new InputHandler(this);

	public InputHandler getInp() {
		return inp;
	}
	public void setInp(InputHandler inp) {
		this.inp = inp;
	}

	public void start() {
		try {
			Display.setDisplayMode(new DisplayMode(800,600));
			Display.create();
			Display.setTitle("Proyecto Juego");
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}

		MainHilo hilo = new MainHilo(this);
		hilo.run();
		Display.destroy();
	}

	public static void main(String[] argv) {
		Main m = new Main();
		m.start();
	}

}

