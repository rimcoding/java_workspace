package ch01;

import java.awt.BorderLayout;

import javax.swing.*;

public class BordeLayoutEx1 extends JFrame{
	
	JButton button1 = new JButton("동");
	JButton button2 = new JButton("서");
	JButton button3= new JButton("남");
	JButton button4= new JButton("북");
	JButton button5 = new JButton("센터");
	// BordeLayoutEx1 <-- 컴포넌트들을 동 서 남 북 센터 이렇게 배치해준다.
	
	public BordeLayoutEx1() {
		initData();
		setInLayout();
	}
	private void initData() {
		setTitle("borderlayout연습");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void setInLayout() {
		setLayout(new BorderLayout());
		//borderLayout , 매개변수 값 하나를 더 추가 시킬 수 있다. (방향 지정가능)
		
		//배열과 for문 활용해서 코드 수정BorderLayout
		add(button1, BorderLayout.EAST);
		add(button2, BorderLayout.WEST);
		add(button3, BorderLayout.SOUTH);
		add(button4, BorderLayout.NORTH);
		add(button5, BorderLayout.CENTER);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new BordeLayoutEx1();
		//외부에서 쓸일이 있으면 변수에 담아서 쓸수 있다.
	
	}
}
