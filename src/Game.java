import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {
	

	private static final long serialVersionUID = 1L;
	public static int width = 240;
	public static int height = 120;
	public static int scale = 3;
	
	public Game() {
		setPreferredSize(new Dimension(width*scale, height*scale));
	}
	

	public static void main(String[] args) {
		
		Game game = new Game();
		
		JFrame frame = new JFrame("Pong");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(game);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

	@Override
	public void run() {
		
	}

}
