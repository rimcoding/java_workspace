package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLabelFrame extends JFrame{

	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;
	public MoveLabelFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		//초기값 셋팅
		labelTextX = 300;
		labelTextY = 350;
		
		labelText = new JLabel("Hello World~");
		labelText.setSize(100,100);
	}

	private void setInitLayout() {
		setLayout(null);
		labelText.setLocation(labelTextX,labelTextY);
		add(labelText);
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				//System.out.println("1");
				//현재 이벤트가 일어난 시점에 x, y 좌표값을 확인
//				int currentX = labelText.getX();
//				int currentY = labelText.getY();
				
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					int X = labelTextX += 50;
					int Y = labelTextY;
					labelText.setLocation(X,Y);
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
			}
		});
	}
}
