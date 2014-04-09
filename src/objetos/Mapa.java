package objetos;

import java.util.LinkedList;
import org.lwjgl.opengl.GL11;

import principal.Main;

public class Mapa {

	private Main m;
	private LinkedList<Player> players;

	public Mapa(Main m){
		this.m = m;
		m.ini();
	}

	public void ini(){
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, 800, 0, 600, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
	}

	public void dibujar(){ // Actualizar mapa

		limpiar();

		// Color del fondo
		GL11.glColor3f(0.5f,0.5f,1.0f);

		// Dibujando fondo
		GL11.glBegin(GL11.GL_QUADS);
		GL11.glVertex2f(10,10);
		GL11.glVertex2f(790,10);
		GL11.glVertex2f(790,790);
		GL11.glVertex2f(10,790);
		GL11.glEnd();
	}

	public void limpiar(){
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
	}
}
