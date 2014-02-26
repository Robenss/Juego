package acciones;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import principal.Main;

public class InputHandler implements KeyListener {
	
	public class Key {
		
		public int presses, absorbs;
		public boolean down, clicked;

		public Key() {
			teclas.add(this);
		}

		public void toggle(boolean pressed) {
			if (pressed != down) { //Si su estado no es el que quiero lo cambio
				down = pressed;
			}
			if (pressed) {
				presses++;
			}
		}

		public void tick() {
			if (absorbs < presses) {
				absorbs++;
				clicked = true;
			} else {
				clicked = false;
			}
		}
	}

	public List<Key> teclas = new ArrayList<Key>();

	public Key arriba = new Key();
	public Key abajo = new Key();
	public Key izq = new Key();
	public Key der = new Key();
	public Key hab1 = new Key();
	public Key hab2 = new Key();
	public Key hab3 = new Key();
	public Key hab4 = new Key();
	public Key menu = new Key();

	public void releaseAll() {
		for (int i = 0; i < teclas.size(); i++) {
			teclas.get(i).down = false;
		}
	}

	public void tick() {
		for (int i = 0; i < teclas.size(); i++) {
			teclas.get(i).tick();
		}
	}

	public InputHandler(Main main) {
		main.addKeyListener(this);
	}

	public void keyPressed(KeyEvent ke) {
		toggle(ke, true);
	}

	public void keyReleased(KeyEvent ke) {
		toggle(ke, false);
	}

	private void toggle(KeyEvent ke, boolean pressed) {

		if (ke.getKeyCode() == KeyEvent.VK_Q) hab1.toggle(pressed);
		if (ke.getKeyCode() == KeyEvent.VK_W) hab2.toggle(pressed);
		if (ke.getKeyCode() == KeyEvent.VK_E) hab3.toggle(pressed);
		if (ke.getKeyCode() == KeyEvent.VK_R) hab4.toggle(pressed);

		if (ke.getKeyCode() == KeyEvent.VK_UP) arriba.toggle(pressed);
		if (ke.getKeyCode() == KeyEvent.VK_DOWN) abajo.toggle(pressed);
		if (ke.getKeyCode() == KeyEvent.VK_LEFT) izq.toggle(pressed);
		if (ke.getKeyCode() == KeyEvent.VK_RIGHT) der.toggle(pressed);

		if (ke.getKeyCode() == KeyEvent.VK_NUMPAD8) arriba.toggle(pressed);
		if (ke.getKeyCode() == KeyEvent.VK_NUMPAD2) abajo.toggle(pressed);
		if (ke.getKeyCode() == KeyEvent.VK_NUMPAD4) izq.toggle(pressed);
		if (ke.getKeyCode() == KeyEvent.VK_NUMPAD6) der.toggle(pressed);

		if (ke.getKeyCode() == KeyEvent.VK_TAB) menu.toggle(pressed);
		if (ke.getKeyCode() == KeyEvent.VK_ENTER) menu.toggle(pressed);
	}

	public void keyTyped(KeyEvent ke) {
	}
}

