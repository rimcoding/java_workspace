package ch04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ch04.MyImageFrame.ImagePanel;

public class MyImageFrame2 extends JFrame {

	private ImagePanel imagePanel; // 내부 클래스 멤버 변수로 선언

	public MyImageFrame2() {
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
		private Image image;

		public ImagePanel() {
			image = new ImageIcon("image3.png").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image, 100, 100, 100, 100, null);
			
		}
	} // end of inner class
	
} // end of outer class
