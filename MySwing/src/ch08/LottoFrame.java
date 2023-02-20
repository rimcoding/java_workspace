package ch08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame implements ActionListener {
	int[] lotto = new int[6]; 		//멤버변수에 담음
	JButton button;
	
	public LottoFrame() {
		initDate();
		setInitLayout();
		addEventListener();
	}

	private void initDate() {
		setTitle("Lotto");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("Lotto start");
	}

	private void setInitLayout() {
		add(button, BorderLayout.NORTH);
		setVisible(true);
	}

	private void addEventListener() {
		button.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("게임 시작 ~");
		lotto = 	getLottoNumber();
//		for(int i = 0; i < lotto.length; i++) {
//			System.out.println("lotto : " +lotto[i]);
//		}
		//여기에 코드 입력 해주세요 ~!
		// 그림을 다시 그리다.
		repaint();	//F5 새로고침
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		//g.setColor(Color.black);
		
		Font f = new Font("돋음체", Font.BOLD,20);
		g.setFont(f);
		
		if(lotto[0]==0) {
			// 게임초기상태
			g.drawString("로또 번호를 클릭하세요", 180, 200);
			 return;
		}
			//추천하지 않는 코드
			for (int i = 0,x =50; i < lotto.length; i++, x+=50) {
				g.drawString(lotto[i]+"", x, 200);
			}
			// 진행 구분
			//코드가 여기 내려오면 버튼을 눌렀다와 같은 의미이다.
			//그럼 메서드와 멤버 변수를 활용해서 그림을 그릴 수 있다.
			g.drawString(lotto[0]+"", 50, 100);		//<-- 여기서 오류 나는 이유는 뭘까요? 앞에 스트링이 들어가야하는데 아니여서
			g.drawString(lotto[1]+"", 150, 100);		
			g.drawString(lotto[2]+"", 250, 100);		
			g.drawString(lotto[3]+"", 350, 100);		
			g.drawString(lotto[4]+"", 450, 100);		
			g.drawString(lotto[5]+"", 550, 100);		
		
	}
	
	public int[] getLottoNumber() {
		int[] lotto = new int[6];
		Random r = new Random();
		
		for(int i= 0; i <lotto.length; i++) {
			int j = r.nextInt(45)+1;
			lotto[i] = j;
			//System.out.println("j : "+j);
			//중복값 확인을 위해 반복문을 생성
			for(int e = 0; e < i; e++) {
				//조건
				if (lotto[i] == lotto[e]) {
					//중복 발생
					//돌아가서 다시 확인해라!!
					i = i -1;
					break;
				}
			}
			//오름 차순 정렬
		}
		Arrays.sort(lotto);		//배열을 정렬 해주는 기능
		return lotto;
	}
	//테스트 코드
	public static void main(String[] args) {
		LottoFrame a = new LottoFrame();
		//a.getLottoNumber();
		//a.getLottoNumber()[i]
				//lotto[0]
				//lotto[1]
//		for(int i= 0; i < a.getLottoNumber().length; i++) {
//			System.out.println(a.getLottoNumber()[i]);
//		}
	} //end of main
}	//end of class

