package ch06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChaneFrame2 extends  JFrame implements ActionListener{
	
	private JPanel panel1;
	private JPanel panel2;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	
	public ColorChaneFrame2() {
	initDate();
	setInitLayout();
	addEventListener();
	}

	private void initDate() {
	setSize(600,600);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel1 = new JPanel();
	panel2 = new JPanel();
	button1 = new JButton("click1");
	button2 = new JButton("click2");
	button3 = new JButton("click3");
	button4 = new JButton("click4");
	button5 = new JButton("click5");
	button6 = new JButton("click6");
	button7 = new JButton("click7");
	}
	private void setInitLayout() {
		add(panel1,BorderLayout.SOUTH);
		add(panel2);
		panel1.setBackground(Color.white);
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		panel1.add(button5);
		panel1.add(button6);
		panel1.add(button7);
		setVisible(true);
	}
	private void addEventListener() {
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new ColorChaneFrame2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.button1) {
			panel2.setBackground(Color.red);
		}else if(e.getSource() == this.button2){
			panel2.setBackground(Color.orange);
		}else if(e.getSource() == this.button3){
			panel2.setBackground(Color.yellow);
		}else if(e.getSource() == this.button4){
			panel2.setBackground(Color.green);
		}else if(e.getSource() == this.button5){
			panel2.setBackground(Color.blue);
		}else if(e.getSource() == this.button6){
			panel2.setBackground(Color.pink);
		}else if(e.getSource() == this.button7){
			panel2.setBackground(Color.GRAY);
		}
	}
	
}
