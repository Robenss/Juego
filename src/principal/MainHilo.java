package principal;

import org.lwjgl.opengl.Display;

public class MainHilo implements Runnable {

	private Main m;
	private boolean dibu = false;

	public MainHilo (Main m){
		this.m = m;
	}
	@Override
	public void run() {
		while (!Display.isCloseRequested()) {
			
			Display.update();
			m.getInp().actu();
			
			if (dibu)
				m.get_mapa().dibujar();
			else
				m.get_mapa().limpiar();
		}

	}
	public boolean getDibu() {
		return dibu;
	}
	public void setDibu(boolean dibu) {
		this.dibu = dibu;
	}



}
