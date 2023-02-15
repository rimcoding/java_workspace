package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MykeyFrame extends JFrame implements KeyListener  {
	
	private JTextArea area;
	// 1.implenments 처리
	// 2.익명 클래스
	public MykeyFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		area = new JTextArea();
	}

	private void setInitLayout() {
		add(area);
		setVisible(true);		
	}

	private void addEventListener() {
		KeyListener keyListener;
		area.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_0) {
			area.append("숫자0번을 눌렀습니다.");
		}else if(e.getKeyCode() == KeyEvent.VK_1) {
			area.append("숫자1번을 눌렀습니다.");
		}else if(e.getKeyCode() == KeyEvent.VK_2) {
			area.append("숫자2번을 눌렀습니다.");
		}else if(e.getKeyCode() == KeyEvent.VK_3) {
			area.append("숫자3번을 눌렀습니다.");
		}else if(e.getKeyCode() == KeyEvent.VK_4) {
			area.append("숫자4번을 눌렀습니다.");
		}else if(e.getKeyCode() == KeyEvent.VK_5) {
			area.append("숫자5번을 눌렀습니다.");
		}else if(e.getKeyCode() == KeyEvent.VK_6) {
			area.append("숫자6번을 눌렀습니다.");
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	
}
