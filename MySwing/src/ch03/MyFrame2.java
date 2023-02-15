package ch03;

import javax.swing.JPanel;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MyFrame2 extends JFrame{
	//내부 클래스를 활용해서집 그림을 그려 주세요.
		// cage --> 결과 사진 올려주세요!!
	class MyDrawPanels extends JPanel {	 	
		@Override	//주석 + 힌트
		public void paint(Graphics g) {
			super.paint(g);
			//하우스
			g.drawRect(120, 300, 300, 200);
			g.drawRect(220, 400, 100, 100);
			g.drawRect(230, 410, 80, 90);
			g.drawRect(230, 410, 40, 90);
			g.drawRect(120, 480, 100, 20);
			g.drawRect(320, 480,100,20);
			g.drawRect(110, 500, 320, 20);
			g.drawLine(0, 520, 600, 520);
			g.drawLine(90, 300,450,300);
			g.drawLine(90, 300, 140, 220);
			g.drawLine(140, 220, 400, 220);
			g.drawLine(400, 220, 450, 300);
			g.drawRect(300, 140, 50, 80);
			g.drawRect(240, 320, 60, 60);
			g.drawRect(250, 330, 40, 40);
			g.drawLine(250, 350, 290, 350);
			g.drawLine(270, 330, 270, 370);
			g.drawOval(330, 80, 30, 30);
			g.drawOval(360, 50, 30, 30);
			g.drawOval(390, 20, 30, 30);
			
			
		}
}

	MyDrawPanels myhouse;
	
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("하우스만들기");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myhouse = new MyDrawPanels();
		
	}
	private void setInitLayout() {
		setVisible(true);
		add(myhouse);
	}	
	}

	
	

