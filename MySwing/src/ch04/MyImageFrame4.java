package ch04;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImageFrame4 extends JFrame{

	public MyImageFrame4() {
		initData();
		setInLayout();
	}

	private void setInLayout() {
		setTitle(getTitle());
		setSize(getPreferredSize());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void initData() {
		add(rootPane);
		setVisible(rootPaneCheckingEnabled);
	}
}

