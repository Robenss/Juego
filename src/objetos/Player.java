package objetos;

public class Player {

	private float x = 400;
	private float y = 300;
	private float o = 0;
	private int hp;
	private int mp;
	private int atk;
	private int def;

	/*public Player(){
		//this.x = 400;
		//this.y = 300; 
	}*/
	
	public float getX() {
		return x;
	}
	
	public void setX(float f) {
		this.x = f;
	}
	
	public float getY() {
		return y;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	
	public float getO() {
		return o;
	}

	public void setO(float o) {
		this.o = o;
	}

	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getMp() {
		return mp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	public int getDef() {
		return def;
	}
	
	public void setDef(int def) {
		this.def = def;
	}
}
