package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// 배치 관리자 연습 - FlowLayout
// components 수평 수직으로 배치해준다
public class FlowLayoutEx3 extends JFrame {
	
	//멤버 변수를 선언할 수 있는가
	// 배열을 활용할 수 있는가
	//생성자 + 메서드를 호출
	// for 문 활용할 수 있는가?
	//GUI 프로그램 익숙해지기 !!	
	
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private FlowLayout flowLayout;

	// JButton 2개 생성
	// 배치관리자 FlowLayout 멤버 변수 선언
	// 화면에 component 그려주세요

	public FlowLayoutEx3() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("JButton");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button1 = new JButton("button1");
		button2 = new JButton("button2");
		flowLayout = new FlowLayout(flowLayout.RIGHT, 20, 20);
	}

	private void setInitLayout() {
		setLayout(flowLayout);
		add(button1);
		add(button2);
	}

	// 테스트
	public static void main(String[] args) {
		new FlowLayoutEx3();
	}
}
