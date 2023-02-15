package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx2 extends JFrame {
	private JButton[] button = new JButton[8];
	// Jbutton
	public NoLayoutEx2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("dsfdsfds");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < button.length; i++) {
		}
	}
	private void setInitLayout() {
		for (int i = 0; i < button.length; i++) {
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		new NoLayoutEx2();
	}
}
