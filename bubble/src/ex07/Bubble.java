package ex07;

import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bubble extends JLabel implements Moveable {

	//버블에 위치 상태
	private int x;
	private int y;
	
	//버블에 움직임 방향 상태
	private boolean left;
	private boolean right;

	//버블이 옆으로 가다가 위로 가는거
	//버블이 벽을 만나면 위로 가는거
	private boolean up;
	
	//버블이 적군을 맞춘 상태 : 0 기본 : 1 (적을 가둔 물방울)
	private int state;
	
	private ImageIcon bubble; 		//기본 물방울 이미지
	private ImageIcon bubbled;	//적을 가둔 상태 이미지
	private ImageIcon bomb;	//물방울이 터진 상태 이미지
	
	private Player player;
	private BackgroundBubbleService backgroundBubbleService;
	
	// 버블은 Player에 의존하고 있다.
	public Bubble(Player player) {
		this.player = player;
		initData();
		setInitLayout();
		backgroundBubbleService = new BackgroundBubbleService(this);
		initThread(); 	//in ---->left() ---> backgroundBubbleService.leftWall();
	}

	private void initData() {
	bubble = new ImageIcon("images/bubble.png");	
	bubbled = new ImageIcon("images/bubbled.png");
	bomb = new ImageIcon("images/bomb.png");
	left = false;
	right = false;
	up = false;
	//state는 기본이 0
	state = 0;
	}

	private void setInitLayout() {
		//플레이어가 있는 위치에 태어나야 한다.
		x = player.getX();
		y = player.getY();
		setIcon(bubble);
		setSize(50,50);
		setLocation(x,y);
	}
	
	//왼쪽or오른쪽 한번 호출 -> 여기에서 for문이 400번 반복하면서
	//x값이 줄어들면서 왼쪽으로 버블이 이동 -> 여기서 슬리프를 줘서 천천히 가게 한다.
	
	private void initThread() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
			if (player.getpWay() == PlayerWay.LEFT){
				//왼쪽 방향을 보고 있다.
				left();
			}else {
				right();
			}
			}
		}).start();
	}

	@Override
	public void left() {
		
		left = true;
		//400번동안 x값이 줄어들면서 버블이 왼쪽으로 나간다.
		for(int i = 0; i < 400; i++) {
			x--;
			setLocation(x,y);
			// 체크 왼쪽 벽이야? --> break;
			//System.out.println(backgroundBubbleService.leftWall());
			if (backgroundBubbleService.leftWall()) {
				break;
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		up();
	}

	@Override
	public void right() {
		right = true;
		
		for(int i = 0; i < 400; i++) {
			x++;
			setLocation(x,y);
			//System.out.println(backgroundBubbleService.rightWall());
			
			if (backgroundBubbleService.rightWall()) {
				break;
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		up();
	}

	@Override
	public void up() {
		up = true;
		while(true) {
			y--;
			setLocation(x,y);
			//System.out.println(backgroundBubbleService.topWall());
			if (backgroundBubbleService.topWall()) {
				break;
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
