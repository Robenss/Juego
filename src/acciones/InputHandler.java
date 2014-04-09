package acciones;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import principal.Main;

public class InputHandler {

	private Main m;

	public InputHandler(Main m){
		this.m = m;
	}
	public void actu(){
		if (Mouse.isButtonDown(0)) {
			int x = Mouse.getX();
			int y = Mouse.getY();

			System.out.println("Cursor en posicion X: " + x + " Y: " + y);
		}

		if (Keyboard.isKeyDown(Keyboard.KEY_SPACE)) {
			System.out.println("espacio");
		}

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
				}
			}
		}
	}
}