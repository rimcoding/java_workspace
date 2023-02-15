package ch01;

import javax.swing.JFrame;

public class BorderLayoutEx4 extends JFrame {

	public BorderLayoutEx4() {
		initdata();
		setInLayout();
	}
	private void initdata() {
		setTitle(getTitle());
		setSize(getPreferredSize());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void setInLayout() {
		setVisible(rootPaneCheckingEnabled);
	}

	
	public static void main(String[] args) {
		new BorderLayoutEx4();
	}
}