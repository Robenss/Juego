package principal;

import java.io.IOException;

import objetos.Mapa;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import acciones.InputHandler;

public class Main {

	private Mapa _mapa = new Mapa(this);
	private InputHandler inp = new InputHandler(this);
	private MainHilo hilo;
	private Fps _fps = new Fps(this);

	public void start() {
		try {
			Display.setDisplayMode(new DisplayMode(800,600));
			Display.setFullscreen(true);
			Display.create();
			Display.setTitle("Proyecto Juego");
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}

		try {
			_mapa.ini();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Matriz del mapa

		hilo = new MainHilo(this);
		hilo.run();
		Display.destroy();
	}

	public MainHilo getHilo() {
		return hilo;
	}

	public void ini(){
	}

	public static void main(String[] argv) {
		Main m = new Main();
		m.start();
	}

	public Mapa get_mapa() {
		return _mapa;
	}
	public void set_mapa(Mapa _mapa) {
		this._mapa = _mapa;
	}
	public InputHandler getInp() {
		return inp;
	}
	public void setInp(InputHandler inp) {
		this.inp = inp;
	}
	public Fps get_fps() {
		return _fps;
	}
}

