package ch11;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AmongUsFrame extends JFrame implements KeyListener{

	//배경 이미지
	BufferedImage backgroundMap;
	//캐릭터 어몽어스 이미지 1
	BufferedImage pinkImage1;
	// 캐릭터 어몽어스 (적군) 이미지 1
	BufferedImage gray_left_image;	
	// jpanel 상속 -> inner class 
	CustomPanel customPanel;

	int pinkX = 200;
	int pinkY = 200;
	int grayX = -20;
	int grayY = 400;
	
	public AmongUsFrame() {
		initData();
		setINitLayout();
		addEventListener();
		//Thread thread = new Thread(customPanel);
		//thread.start();
		new Thread(customPanel).start();
	}

	private void initData() {
		setTitle("미니어몽어스");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 이미지 3개 있음, CustomPanel
		try {
			//컨트롤 F2해서 복사 붙여놓기
			backgroundMap = ImageIO.read(new File("images/background_map.png"));
			pinkImage1 = ImageIO.read(new File("images/pink_image1.png"));
			gray_left_image = ImageIO.read(new File("images/gray_left_image.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//CustomPanel 메모리에 올라 가는 순간 paintComponent() 메서드 호
		customPanel = new CustomPanel();
	}
	

	private void setINitLayout() {
		// 레이아웃은 기본 레이아웃으로 설정 함
		//add 호출시 paintComponent 메서드 실행
		add(customPanel);
		setVisible(true);
	}

	private void addEventListener() {
		//이벤트 리스너 등록처리
		this.addKeyListener(this);
	}
	class CustomPanel extends JPanel implements Runnable{
		
		//boolean isRight = true;
		
		//BufferedImage
		//paint s 있는거는 안됨
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundMap,0,0, getWidth(), getHeight(),null);
			g.drawImage(pinkImage1 , pinkX , pinkY , 100, 100, null);
			g.drawImage(gray_left_image , grayX , grayY , 100 , 100 , null);
		}

		@SuppressWarnings("null")
		@Override
		public void run() {
			System.out.println("1");
			boolean isRight = true;
			
			while(true) {
				if(isRight) {
					grayX += 10;
				} else {
					grayX -= 10;
				}
				
				// 방향 체크
				if (grayX == 500) {
					isRight = false;
				}
				if(grayX == - 20) {
					isRight = true;
				}
				if (grayX==pinkX && grayY==pinkY) {
					
					pinkImage1=null;
				}
				
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				repaint();
			}
			
		}
	}	//end of inner class
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		System.out.println("keyCode : " +keyCode);
		if (keyCode == KeyEvent.VK_LEFT) {
			//상항 연산자 복습 !!
			// 변수 = 조건식 ? 결과 1 : 결과 2
			//왼쪽 이동
			pinkX = (pinkX <0) ? -20 : pinkX - 10; 	//왼쪽 벽 막기 
			//pinkX -= 10;
		}else if(keyCode == KeyEvent.VK_RIGHT) {
			//삼항 연산자 복습!
			//오른쪽 이동
			pinkX = (pinkX > 520) ? +520 : pinkX +10;
			//pinkX += 10;
		}else if(keyCode == KeyEvent.VK_UP) {
			pinkY = (pinkY <0) ? -20 : pinkY -10;
			//pinkY -= 10;
			//위로 이동
		}else if(keyCode == KeyEvent.VK_DOWN) {
			pinkY = (pinkY > 520) ? +520 : pinkY +10;
			//pinkY += 10;
			//아래로 이동
		}
		
		//그림을 다시 그려주다 실행!!
		repaint();
	}

	
	
	@Override
	public void keyReleased(KeyEvent e) {
		
	}
}	//end of outer class
