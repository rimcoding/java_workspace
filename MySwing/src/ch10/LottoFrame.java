package ch10;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame {

	JButton button;
	LottoRandomNumber lottoRandomNumber;
	
	boolean isStart = false;
	
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("게임 스타트");
		lottoRandomNumber = new LottoRandomNumber();
	}

	private void setInitLayout() {
		add(button, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if (isStart == false) {
			g.drawString("게임을 실행해주세요", 150, 150);
			return;
		}
		int[] getNumbers = lottoRandomNumber.createNumber();
		g.drawString(getNumbers[0] + "", 50, 150);
		g.drawString(getNumbers[1] + "", 150, 150);
		g.drawString(getNumbers[2] + "", 250, 150);
		g.drawString(getNumbers[3] + "", 350, 150);
		g.drawString(getNumbers[4] + "", 450, 150);
		g.drawString(getNumbers[5] + "", 550, 150);
	}
	//paint는 오버라이드가 자동완성 된다.
	
	private void addEventListener() {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isStart = true;
				repaint();
			}
		});
	}
}
