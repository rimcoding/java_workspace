package ch01;

import java.awt.BorderLayout;

import javax.swing.*;

public class BordeLayoutEx2 extends JFrame{
	//배열과 for 문 활용해서 코드 수정
	//	String[] diection = new String[5];
	//변수 선언과 동시에 초기화 가능
	String[] diection = {BorderLayout.EAST,BorderLayout.WEST,
			BorderLayout.NORTH,BorderLayout.SOUTH,BorderLayout.CENTER};
	JButton[] button = new JButton[5];

	// BordeLayoutEx1 <-- 컴포넌트들을 동 서 남 북 센터 이렇게 배치해준다.
	
	public BordeLayoutEx2() {
		initData();
		setInLayout();
	}
	private void initData() {
		setTitle("borderlayout연습");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton(diection[i]);
		}
	}
	private void setInLayout() {
		setLayout(new BorderLayout());
		//borderLayout , 매개변수 값 하나를 더 추가 시킬 수 있다. (방향 지정가능)
		
		//배열과 for문 활용해서 코드 수정BorderLayout
		for (int i = 0; i < button.length; i++) {
			add(button[i],diection[i]);
		}
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new BordeLayoutEx2();
		//외부에서 쓸일이 있으면 변수에 담아서 쓸수 있다.
	
	}
}
