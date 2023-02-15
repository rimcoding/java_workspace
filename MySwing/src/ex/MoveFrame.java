package ex;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveFrame extends JFrame{

	private JLabel player;
	private int imageX;
	private int imageY;

	public MoveFrame() {
	initDate();
	setInitLayout();
	addEventListener();
	imageX=700;
	imageY=700;
}

	private void initDate() {
		setSize(1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Icon icon = new ImageIcon("images/image3.png");
		player = new JLabel(icon);
		player.setSize(200,200);
	}

	private void setInitLayout() {
		setLayout(null);
		player.setLocation(200,200);
		add(player);
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
	
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					
				}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
						
					}
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					
				}
			}
		});
	}
	public static void main(String[] args) {
		new MoveFrame();
	}
}
