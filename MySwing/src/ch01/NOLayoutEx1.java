package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

// 좌표 기반으로 컴포넌트들을 배치해 보자.
public class NOLayoutEx1 extends JFrame{
	// JFame 상속을 빼먹지 말자.
	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	public NOLayoutEx1() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("borderayout연습");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button1.setSize(100,100);
		button2 = new JButton("button2");
		button2.setSize(100,50);
		button3 = new JButton("button3");
		button3.setSize(200,30);
	}
	private void setInitLayout() {
		setLayout(null);	//좌표기반으로 컴포넌트들을 배치해야 한다.
		// 좌표 기반을 셋팅을 하면 각 컴포넌트에 크기를 지정해 주어야 한다 기본값은 0 이다. 
		//좌표를 지정안해주면 화면에 안나온다.
		button1.setLocation(100,100); //위에서 부터 밑으로 좌표가 찍히며 x,y축값이 찍히는 지점에서 버튼이 생긴다.
		add(button1);
		button2.setLocation(200,150);
		add(button2);
		button3.setLocation(450,200);
		add(button3);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new NOLayoutEx1();
	}
}
