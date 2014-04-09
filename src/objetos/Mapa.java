package objetos;

import org.lwjgl.opengl.GL11;

import principal.Main;

public class Mapa {

	private Main m;

	private Player _player;

	public Mapa(Main m){
		this.m = m;
		m.ini();
	}

	public void ini(){
		_player = new Player();
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, 800, 0, 600, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
	}

	public void dibujar_fondo(){ // Actualizar mapa

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

	public void dibujar_player(){
		float x = _player.getX();
		float y = _player.getY();

		GL11.glColor3f(0.2f,0.8f,1.0f);
		
		GL11.glPushMatrix();
		GL11.glTranslatef(x, y, 0);
		GL11.glRotatef(_player.getO(), 0f, 0f, 1f);
		GL11.glTranslatef(-x, -y, 0);

		GL11.glBegin(GL11.GL_QUADS);
		GL11.glVertex2f(x - 50, y - 50);
		GL11.glVertex2f(x + 50, y - 50);
		GL11.glVertex2f(x + 50, y + 50);
		GL11.glVertex2f(x - 50, y + 50);
		GL11.glEnd();
		GL11.glPopMatrix();
	}

	public void limpiar(){
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
	}

	public Player get_player() {
		return _player;
	}
	
	public void set_player(Player p){
		this._player = p;
	}
}
