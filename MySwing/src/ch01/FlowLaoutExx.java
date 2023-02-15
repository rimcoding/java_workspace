
package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class FlowLayoutExx extends JFrame {
	
	JButton[] buttons = new JButton[7];
	public FlowLayoutExx() {
		initData();
		setInitLayout();
	}
	// 메서드 
	private void initData() {
		this.setTitle("Flow Layout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 500);
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("button" + i);
		}
	}
	private void setInitLayout() {
		this.setVisible(true);
		// 배치 관리자 -> 메서드 안에서 바로 생성 
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		for (int i = 0; i < buttons.length; i++) {
			this.add(buttons[i]);
		}
	}
}

//////////////////////////////////////
public class FlowLaoutExx {

	public static void main(String[] args) {
		new FlowLayoutEx();

	}

}

