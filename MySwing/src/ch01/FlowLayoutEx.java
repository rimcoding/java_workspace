package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// 배치 관리자 연습 - FlowLayout
// components 수평 수직으로 배치해준다
public class FlowLayoutEx extends JFrame {

	private JButton button1;
	private JButton button2;
	private JButton button3;

	// 버튼 3개 더 생성해서 화면에 보이게 코드 수정
	private JButton button4;
	private JButton button5;
	private JButton button6;

	public FlowLayoutEx() {
		// 초기화 값 세팅 (메서드 역할 분담)
		initData();
		setInitLayout();
	}

	public void initData() {
		setTitle("FlowLayout 연습");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button1 = new JButton("button1");
		button2 = new JButton("button2");
		button3 = new JButton("button3");
		button4 = new JButton("button4");
		button5 = new JButton("button5");
		button6 = new JButton("button6");
	}

	public void setInitLayout() {
		// 배치 관리자를 설정해보자
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 200));
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		add(button6);
	}

	// 코드 테스트
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}
