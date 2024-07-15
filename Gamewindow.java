package userinterface;

import javax.swing.JFrame;

public class Gamewindow extends JFrame {
	
	public static final int SCREEN_WIDTH = 600;
	private GameScreen gameScreen;
        //Trex_connection trex_con;
	
	public Gamewindow() {
		super("Java T-Rex game");
		setSize(SCREEN_WIDTH, 175);
		setLocation(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
                gameScreen = new GameScreen();
               //trex_con=new Trex_connection();
		addKeyListener(gameScreen);
		add(gameScreen);
                /*add(trex_con);
                addActionListener(trex_con);*/
	}
	
	public void startGame() {
		setVisible(true);
		gameScreen.startGame();
	}
	
	public static void main(String args[]) {
		(new Gamewindow()).startGame();
	}
}
