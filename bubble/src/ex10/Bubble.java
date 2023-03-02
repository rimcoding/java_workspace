package ex10;

import java.util.Iterator;

import javax.imageio.stream.MemoryCacheImageOutputStream;
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
	
	private BubbleFrame mContext;
	
	private Player player;
	
	private BackgroundBubbleService backgroundBubbleService;
	
	// 버블은 Player에 의존하고 있다.
	public Bubble(BubbleFrame mContext) {
		this.mContext = mContext;
		
		//this.player = player;
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
		x = mContext.getPlayer().getX();
		y = mContext.getPlayer().getY();
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
			if (mContext.getPlayer().getpWay() == PlayerWay.LEFT){
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
			//적군 위치 감지 - 범위 값 계산 --> + --> 절대값 구해서
			//x , y <---- 적군 
			//System.out.println("적군 x위치 : " + mContext.getEnemy().getX());
			// 절대값 계산 
			//물방울에 x 좌표값이 90
			//적군에 x 좌표값이 150
			//60 차이 나는 상태
			if(Math.abs(x - mContext.getEnemy().getX()) < 10
				&& Math.abs(y - mContext.getEnemy().getY()) < 50)	 {
				//적군이 살아있는 상태에서만 crash() 호출 시킬 예정
				if(mContext.getEnemy().getState() == 0) {
					crash();
				}
				
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
			if(Math.abs(x - mContext.getEnemy().getX()) < 10
					&& Math.abs(y - mContext.getEnemy().getY()) < 50)	 {
				if(mContext.getEnemy().getState() == 0) {
					crash();
				}
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
		clearBubble();
		
	}
	//메서드 행위(동사) -> (목적어)
	private void clearBubble() {
		try {
			Thread.sleep(3000);
			setIcon(bomb);
			Thread.sleep(500);
			//this.setVisible(false); //화면에는 안보이는데 메모리에는 남아있음
			setIcon(null);
			//터진다음에 0.5초 다음에 그림을 지우기
			//repaint(); //전부다 다시 그린다. (과부하)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void crash() {
		//0,1 물방울
		mContext.getEnemy().setState(1);
		state = 1;
		setIcon(bubbled);
		//heap 메모리에서는 아직 남아 있다. (가비지컬렉터가 알아서 제거 해 준다)
		mContext.remove(mContext.getEnemy());
		mContext.repaint();
	}
} //end of class
