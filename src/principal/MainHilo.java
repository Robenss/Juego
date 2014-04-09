package principal;

import org.lwjgl.opengl.Display;

public class MainHilo implements Runnable {

	private Main m;
	private boolean dibu_f = false;
	private boolean dibu_p = false;

	public MainHilo (Main m){
		this.m = m;
	}
	@Override
	public void run() {
		while (!Display.isCloseRequested()) {
			
			Display.update();
			m.getInp().actu();
			m.get_mapa().limpiar();
			
			if (dibu_f)
				m.get_mapa().dibujar_fondo();
			else if (dibu_p)
				m.get_mapa().dibujar_player();		
		}

	}
	public boolean getDibu() {
		return dibu_f;
	}
	public void setDibu(boolean dibu) {
		this.dibu_f = dibu;
	}
	public boolean getDibu_p() {
		return dibu_p;
	}
	public void setDibu_p(boolean dibu_p) {
		this.dibu_p = dibu_p;
	}
}
