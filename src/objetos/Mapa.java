package objetos;

import java.io.IOException;

import org.lwjgl.opengl.GL11;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

import principal.Main;

public class Mapa {

	private Main m;
	private Texture textura;

	private Player _player;

	public Mapa(Main m){
		this.m = m;
		m.ini();
	}

	public void ini() throws IOException{
		_player = new Player();
		GL11.glEnable(GL11.GL_TEXTURE_2D);  
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, 800, 0, 600, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		textura = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/poolpartyziggs01.png"));
		textura.bind();
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

	public void dibujar_player() throws IOException{
		float x = _player.getX();
		float y = _player.getY();

		GL11.glColor3f(0.2f,0.8f,1.0f);

		GL11.glPushMatrix();
		GL11.glTranslatef(x, y, 0);
		GL11.glRotatef(_player.getO(), 0f, 0f, 1f);
		GL11.glTranslatef(-x, -y, 0);



		GL11.glBegin(GL11.GL_QUADS);
		GL11.glTexCoord2f(0,0);
		GL11.glVertex2f(x - 50, y - 50);
		GL11.glTexCoord2f(1,0);
		GL11.glVertex2f(x + 50 + (textura.getTextureWidth()/2), y - 50);
		GL11.glTexCoord2f(1,1);
		GL11.glVertex2f(x + 50 + (textura.getTextureWidth()/2), y + 50 + (textura.getTextureHeight()/2));
		GL11.glTexCoord2f(0,1);
		GL11.glVertex2f(x - 50, y + 50 + (textura.getTextureHeight()/2));
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

	public Texture getTextura() {
		return textura;
	}

	public void setTextura(Texture textura) {
		this.textura = textura;
	}
}
