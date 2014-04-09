package acciones;

import objetos.Player;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import principal.Main;

public class InputHandler {

	private Main m;
	private Player _player;

	public InputHandler(Main m){
		this.m = m;
		this._player = new Player();
	}

	public void actu(){
		int delta = m.get_fps().getDelta();
		if (Mouse.isButtonDown(0)) {
			int x = Mouse.getX();
			int y = Mouse.getY();

			System.out.println("Cursor en posicion X: " + x + " Y: " + y);
		}

		if (Keyboard.isKeyDown(Keyboard.KEY_SPACE)) {
			System.out.println("espacio");
		}
		else if (Keyboard.isKeyDown(Keyboard.KEY_RIGHT)){
			_player.setX(_player.getX()+(0.35f * delta));
		}
		else if (Keyboard.isKeyDown(Keyboard.KEY_LEFT)){
			_player.setX(_player.getX()-(0.35f * delta));
		}
		else if (Keyboard.isKeyDown(Keyboard.KEY_UP)){
			_player.setY(_player.getY()+(0.35f * delta));
		}
		else if (Keyboard.isKeyDown(Keyboard.KEY_DOWN)){
			_player.setY(_player.getY()-(0.35f * delta));
		}

		_player.setO(_player.getO()+(0.15f * delta));
		if (_player.getX() < 50) _player.setX(50);
		if (_player.getX() > 750) _player.setX(750);
		if (_player.getY() < 50) _player.setY(50);
		if (_player.getY() > 550) _player.setY(550);

		m.get_mapa().set_player(_player);
		m.get_fps().updateFPS();

		while (Keyboard.next()) {
			if (Keyboard.getEventKeyState()) {
				switch (Keyboard.getEventKey()){
				case Keyboard.KEY_W:
					System.out.println("W apretada");
					break;
				case Keyboard.KEY_A:
					System.out.println("A apretada");
					break;
				case Keyboard.KEY_S:
					System.out.println("S apretada");
					break;
				case Keyboard.KEY_D:
					System.out.println("D apretada");
					break;
				}
			} else {
				switch (Keyboard.getEventKey()){
				case Keyboard.KEY_W:
					System.out.println("W soltada");
					break;
				case Keyboard.KEY_A:
					System.out.println("A soltada");
					break;
				case Keyboard.KEY_S:
					System.out.println("S soltada");
					break;
				case Keyboard.KEY_D:
					System.out.println("D soltada");
					break;
				case Keyboard.KEY_M:
					m.getHilo().setDibu(!m.getHilo().getDibu());
					break;
				case Keyboard.KEY_N:
					m.getHilo().setDibu_p(!m.getHilo().getDibu_p());
					break;
				}
			}
		}
	}
}