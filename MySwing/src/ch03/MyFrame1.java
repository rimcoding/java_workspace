package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * 학습뫂교
 * 내부 클래스,외부 클래스
 *
 */
public class MyFrame1 extends JFrame{
	
	//JPanel jPanel;
	MyDrawPanel drawPanel;
	
	//내부 클래스 선언 - inner class
	//내부 클래스에는 - 정적 클래스,인스턴스 클래스
	//정적 : static <-- (new 접근 가능) 클래스 접근 가능
	//인스 : 외부 클래스가 먼저 new가 되어야 하고, 내부 클래스 역시 new 되어야 한다.
	
	//집을 그리고 창문을 그려주세요.
	//별을 그려주세요.
	class MyDrawPanel extends JPanel{
	@Override	//주석 + 힌트
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawRect(100, 100, 100, 200);
		g.drawRect(100, 50, 50, 50);
		g.drawString("반가워", 300, 300);
		g.drawLine(250, 300, 500, 550);
		g.drawOval(300, 300, 50, 50);
	}
	}
	
	public MyFrame1() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("내부클래스란");
		setSize(600,600);
		//setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new MyDrawPanel();
	}
	private void setInitLayout() {
		setVisible(true);
		add(drawPanel);
	}
}//end of class

class MyDrawPanel extends JPanel {	 		//JPanel도 상속받을수있다.
	//paints,print 둘다 아니다. paint!!!
		@Override	//주석 + 힌트
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);
			g.drawRect(100, 100, 100, 200);
		}
}
