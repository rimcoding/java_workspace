package ch02;

import java.awt.FlowLayout;
import java.security.DomainCombiner;

import javax.swing.*;

public class MyComponents extends JFrame{
	private JButton button1;
	private JLabel label;		//글자를 넣어서 화면에 띄울수 있다.
	private JTextField textFieId;	//사용자한테 입력값을 받을 수 있는 컴포넌트
	private JPasswordField jPasswordFirId;
	private JCheckBox checkBox;
	
	public MyComponents() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("컴포넌트 확인");
		setSize(900,900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("JButton");
		label = new JLabel("글자를 적는 컴포넌트");
		textFieId = new JTextField("아이디입력",20);
		jPasswordFirId = new JPasswordField("비번입력",10);
		checkBox = new JCheckBox("동의");
		
	}
	private void setInitLayout() {
		add(button1);
		add(label);
		add(textFieId);
		add(jPasswordFirId);
		add(checkBox);
		
		setLayout(new FlowLayout());
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new MyComponents();
	}
}
