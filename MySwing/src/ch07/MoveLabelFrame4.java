package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLabelFrame4 extends JFrame implements Moveable{

	private JLabel player;
	private int playerX;
	private int playerY;
	
	public MoveLabelFrame4() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("그림 움직여보기");
		playerX = 300;
		playerY = 350;
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Icon icon = new ImageIcon("images/image3.png");
		player = new JLabel(icon);
		player.setSize(200,200);
		setResizable(false);
	}

	private void setInitLayout() {
		setLayout(null);
		add(player);
		player.setLocation(playerX,playerY);
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				int X = playerX ;
				int Y = playerY;
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right();
				}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					left();
				}else if(e.getKeyCode() == KeyEvent.VK_UP) {
					up();
				}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					down();
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
	}
	@Override
	public void left() {
		int X = playerX -=50;
		int Y = playerY;
		if (X < 0) {
			X=0;
			playerX =0;
		}
		player.setLocation(X,Y);
	
	}

	@Override
	public void right() {
		int X = playerX +=50;
		int Y = playerY;
		if (X > 600) {
			X=600;
			playerX = 600;
		}
		player.setLocation(X,Y);
	
	}

	@Override
	public void up() {
		int X = playerX;
		int Y = playerY -=50;
		if (Y < 0) {
			Y=0;
			playerY =0;
		}
		player.setLocation(X,Y);
	
	}

	@Override
	public void down() {
		int X = playerX;
		int Y = playerY +=50;
		if (Y > 570) {
			Y=570;
			playerY =570;
		}
		player.setLocation(X,Y);
	
	}
	public static void main(String[] args) {
		new MoveLabelFrame4();
	}
}

