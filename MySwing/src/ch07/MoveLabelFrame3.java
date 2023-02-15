package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLabelFrame3 extends JFrame implements Moveable{

	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;
	
	public MoveLabelFrame3() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		labelTextX = 300;
		labelTextY = 350;
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		//초기값 셋팅
		
		labelText = new JLabel("Hello World~");
		labelText.setSize(100,100);
	}

	private void setInitLayout() {
		setLayout(null);
		add(labelText);
		labelText.setLocation(labelTextX,labelTextY);
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
				int X = labelTextX ;
				int Y = labelTextY;
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
				// TODO Auto-generated method stub
			}
		});
	}
	@Override
	public void left() {
		int X = labelTextX -=50;
		int Y = labelTextY;
		if (X < 0) {
			X=0;
			labelTextX =0;
		}
			labelText.setLocation(X,Y);
	
	}

	@Override
	public void right() {
		int X = labelTextX +=50;
		int Y = labelTextY;
		if (X > 700) {
			X=700;
			labelTextX = 700;
		}
			labelText.setLocation(X,Y);
	
	}

	@Override
	public void up() {
		int X = labelTextX;
		int Y = labelTextY -=50;
		if (Y < 0) {
			Y=0;
			labelTextY =0;
		}
			labelText.setLocation(X,Y);
	
	}

	@Override
	public void down() {
		int X = labelTextX;
		int Y = labelTextY +=50;
		if (Y > 700) {
			Y=700;
			labelTextY =700;
		}
			labelText.setLocation(X,Y);
	
	}
}
