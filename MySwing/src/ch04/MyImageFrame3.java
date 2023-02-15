package ch04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImageFrame3 extends JFrame {

	private ImagePanel imagePanel; // 내부 클래스 멤버 변수로 선언

	public MyImageFrame3() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("이미지 연습");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		add(imagePanel);
		setVisible(true);
	}

	// 정적 - 내부 클래스
	static class ImagePanel extends JPanel {
		private Image image1;
		private Image image2;
		private Image image3;
		
		public ImagePanel() {
			image1 = new ImageIcon("image1.png").getImage();
			image2 = new ImageIcon("image2.png").getImage();
			image3 = new ImageIcon("image3.png").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			//먹이 
			g.drawImage(image1, 300, 150, 100, 100, null);
			g.drawImage(image1,340,70,100,100,null);
			g.drawImage(image1,380,0,100,100,null);
			g.drawImage(image1, 360, 150, 100, 100, null);
			g.drawImage(image1,400,70,100,100,null);
			g.drawImage(image1,440,0,100,100,null);
			g.drawImage(image1, 420, 150, 100, 100, null);
			g.drawImage(image1,460,70,100,100,null);
			g.drawImage(image1,500,0,100,100,null);
			g.drawImage(image3,200,0,100,100,null);
			//괴물
			g.drawImage(image2,200,200,200,200,null);
			
			//도망가는애
			g.drawImage(image1, 300, 400, 100, 100, null);
			g.drawImage(image1, 340, 400, 150, 150, null);
			g.drawImage(image1, 450, 400, 80, 80, null);
			g.drawImage(image1, 240, 400, 100, 100, null);
			g.drawImage(image1, 300, 150, 100, 100, null);
			g.drawImage(image1, 300, 150, 100, 100, null);
		}
	} // end of inner class
	
} // end of outer class
