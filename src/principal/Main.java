package principal;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

import objetos.IA;
import objetos.Mapa;
import objetos.Player;
import acciones.InputHandler;

public class Main extends Canvas implements Runnable {

	private Player player;
	private Mapa mapa;
	private IA ia;
	private InputHandler input = new InputHandler(this);

	public static void main(String[] args) {
		Main pant = new Main();
		pant.setMinimumSize(new Dimension(1000, 800));
		pant.setMaximumSize(new Dimension(1000, 800));
		pant.setPreferredSize(new Dimension(1000, 800));

		JFrame frame = new JFrame("LoLErillos");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(pant, BorderLayout.CENTER);
		frame.pack();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
