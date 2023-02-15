package ch06;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorChangeFrame extends JFrame implements ActionListener {
	
	//이벤트 리스너에 대한 개념을 알자
	//ColorChangeFrame 다형성이 적용이 되어서
	//ActionListener 타입으로도 바라볼수 있다.
	
	//이벤트리스너 등록
	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	public ColorChangeFrame() {
	initData();
	setInLayout();
	addEventListener();
	}
	
	private void initData() {
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("click 1");
		button2 = new JButton("click 2");
		button3 = new JButton("click 3");
	}
	private void setInLayout() {
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(button3);
		setVisible(true);
	}
private void addEventListener() {
		//ActionListener actionLister;
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		//this가 허용되는 이유
		//나는 ColorChangeFrame도 되고 ActionListener 도 된다 (다형성을 생각하자)
		//actionListener와 연결해주지 않으면 오버라이드가 호출되지 않는다.
	}
	
	//코드테스트
	public static void main(String[] args) {
		new ColorChangeFrame();
	
	
	}//end of main

	// actionPerformed 호출 되어짐 !
	// 직접 호출하는것과 달리 흐름이 다르다.
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("acrionPerformed 메소드 호출 됨");
		System.out.println(e.toString());
		this.setBackground(Color.blue);
	}
}//end of class
