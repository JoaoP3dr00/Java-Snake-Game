package snakegame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener{
	
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGTH = 600;
	static final int UNIT_SIZE = 25;
	static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGTH)/UNIT_SIZE;	// Calculate how many objects we want to fit on the screen 
	static final int DELAY = 75;	// Delay for the timer
	// These arrays holds all of the coordinates for all of the body parts of our snake, including the head
	final int x[] = new int[GAME_UNITS];
	final int y[] = new int[GAME_UNITS];
	int bodyParts = 6;	// Initial amount of body parts
	int applesEaten;
	int appleX;
	int appleY;
	char direction = 'R';
	boolean running = false;
	Timer timer;
	Random random;
	
	GamePanel(){
		random = new Random();
	}
	
	public void stratGame(){
		
	}
	
	// Método responsável por desenhar os componentes gráficos do painel.
	public void paintComponent(Graphics g){
		
	}
	
	
	public void draw(Graphics g){
		
	}
	
	public void move(){
		
	}
	
	public void checkApple(){
		
	}
	
	public void checkCollisions(){
		
	}
	
	public void gameOver(Graphics g){
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public class MyKeyAdapter extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e){
			
		}
		
	}
	
}
