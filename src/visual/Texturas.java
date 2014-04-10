package visual;

import org.newdawn.slick.opengl.Texture;

import principal.Main;

public class Texturas {

	private String descripcion;
	private Texture tex;
	
	public Texturas(){
		
	}
	public Texturas(String d, Texture tex){
		this.descripcion = d;
		this.tex = tex;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Texture getTex() {
		return tex;
	}
	public void setTex(Texture tex) {
		this.tex = tex;
	}

	
}
