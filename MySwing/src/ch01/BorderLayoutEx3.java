package ch01;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class BorderLayoutEx3 extends JFrame{
	
	public BorderLayoutEx3() {
		initData();
		setInLayout();
	}

	private void initData() {
		setTitle(getTitle());
		setSize(getPreferredSize());
		setDefaultCloseOperation(ABORT);
	}

	private void setInLayout() {
		add(rootPane);
	}
}
	