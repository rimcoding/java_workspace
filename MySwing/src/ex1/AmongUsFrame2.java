package ex1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AmongUsFrame2 extends JFrame implements KeyListener {

	// 배경 이미지
	BufferedImage backgroundMap;
	// 캐릭터 어몽어스(그레이) 왼발
	BufferedImage gray_left_image;
	// 캐릭터 어몽어스(그레이) 오른발
	BufferedImage gray_right_image;
	// jpanel 상속 -> inner class
	CustomPanel customPanel;

	int grayX = -20;
	int grayY = 400;

	public AmongUsFrame2() {
		initData();
		setINitLayout();
		addEventListener();
		// Thread thread = new Thread(customPanel);
		// thread.start();
		new Thread(customPanel).start();
	}

	private void initData() {
		setTitle("미니어몽어스");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 이미지 3개 있음, CustomPanel
		try {
			// 컨트롤 F2해서 복사 붙여놓기
			backgroundMap = ImageIO.read(new File("images/background_map.png"));
			gray_left_image = ImageIO.read(new File("images/gray_left_image.png"));
			gray_right_image = ImageIO.read(new File("images/gray_right_image.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// CustomPanel 메모리에 올라 가는 순간 paintComponent() 메서드 호출
		customPanel = new CustomPanel();
	}

	private void setINitLayout() {
		// 레이아웃은 기본 레이아웃으로 설정 함
		// add 호출시 paintComponent 메서드 실행
		add(customPanel);
		setVisible(true);
	}

	private void addEventListener() {
		// 이벤트 리스너 등록처리
		this.addKeyListener(this);
	}

	class CustomPanel extends JPanel implements Runnable {

		// boolean isRight = true;

		// BufferedImage
		// paint s 있는거는 안됨
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundMap, 0, 0, getWidth(), getHeight(), null);
			
			if (grayX % 15 == 0) {
				g.drawImage(gray_left_image, grayX, grayY, 100, 100, null);
			} else {
				g.drawImage(gray_right_image, grayX, grayY, 100, 100, null);
			};
		}

		@SuppressWarnings("null")
		@Override
		public void run() {
			// System.out.println("1");
			boolean isRight = true;

			while (true) {
				if (isRight) {
					grayX += 20;
				} else {
					grayX -= 20;
				}

				// 방향 체크
				if (grayX == 500) {
					isRight = false;
				}
				if (grayX == -20) {
					isRight = true;
				}

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				repaint();
			}

		}

	} // end of inner class

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		System.out.println("keyCode : " + keyCode);
		if (keyCode == KeyEvent.VK_LEFT) {
		} else if (keyCode == KeyEvent.VK_RIGHT) {
		} else if (keyCode == KeyEvent.VK_UP) {
		} else if (keyCode == KeyEvent.VK_DOWN) {
		}

		// 그림을 다시 그려주다 실행!!
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
} // end of outer class
