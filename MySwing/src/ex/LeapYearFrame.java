package ex;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LeapYearFrame extends JFrame{

	JPanel panel1;
	JPanel panel2;
	JLabel label;
	JTextField textField;
	JButton button;
	LeapYearCalculator calculator;
	
	public LeapYearFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textField = new JTextField("2000",10);
		button = new JButton("윤년 체크");
		panel1 = new JPanel();
		panel1.setSize(300,40);
		panel2 = new JPanel();
		panel2.setSize(300,110);
		label = new JLabel();
		calculator = new LeapYearCalculator(0);
	}

	private void setInitLayout() {
		
		setLayout(null);
		add(panel1);
		panel1.add(textField);
		panel1.add(button);
		panel1.setLocation(0,0);
		panel1.setBackground(Color.gray);
		
		add(panel2);
		panel2.add(label);
		panel2.setLocation(0,40);
		panel2.setBackground(Color.LIGHT_GRAY);
		
		setVisible(true);
	}

	private void addEventListener() {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String userInput = textField.getText();
				int year = Integer.parseInt(userInput);
				calculator.setYear(year);
				label.setText(calculator.Calculate());
				repaint();
			}
		});
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}
	public static void main(String[] args) {
		new LeapYearFrame();
	}
}
