package ex08;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {

	BubbleFrame mContext;
	
	private int x;
	private int y;
	private ImageIcon playerR , playerL;
	
	
	//플레이어 방향 상태(enum 타입 사용 : 데이터에 범주화)
	private PlayerWay pWay;
	
	
	// 플레이어에 현재 움직임 상태를 기록
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
	//벽에 출동한 상태
	private boolean leftWallCrash;
	private boolean rightWallCrash;
	
	// 플레이어의 속도 상태
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;
	
	//setter 메서드 만들기 left, right
	
	
	public Player(BubbleFrame mContext) {
		this.mContext = mContext;
		initData();
		setInitLayout();
	}
	//getter 메서드 추가 left,right, isLeftWallCrash추가 isRightWallCrash 추가
	

	//setter method
	public void setLeft(boolean left) {
		this.left = left;
	}
	public PlayerWay getpWay() {
		return pWay;
	}


	public void setpWay(PlayerWay pWay) {
		this.pWay = pWay;
	}


	public void setRight(boolean right) {
		this.right = right;
	}


	public boolean isLeftWallCrash() {
		return leftWallCrash;
	}


	public void setLeftWallCrash(boolean leftWallCrash) {
		this.leftWallCrash = leftWallCrash;
	}


	public boolean isRightWallCrash() {
		return rightWallCrash;
	}


	public void setRightWallCrash(boolean rightWallCrash) {
		this.rightWallCrash = rightWallCrash;
	}


	public boolean isLeft() {
		return left;
	}


	public boolean isRight() {
		return right;
	}
	


	public boolean isUp() {
		return up;
	}


	public void setUp(boolean up) {
		this.up = up;
	}


	public boolean isDown() {
		return down;
	}


	public void setDown(boolean down) {
		this.down = down;
	}


	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
		
		left = false;
		right = false;
		up = false;
		down = false;
		leftWallCrash =false;
		rightWallCrash = false;
		pWay = PlayerWay.RIGHT;
	}


	private void setInitLayout() {
		x = 500;
		y =535;
		//좌표기반 라벨에 크기를 지정해야 한다.
		setSize(50 , 50);
		setLocation(x,y);
		// JLabel 에 아이콘을 셋팅하는 메서드
		setIcon(playerR);
	}


	@Override
	public void left() {
		pWay = PlayerWay.LEFT;
		left = true;
		// 한번 키보드 왼쪽 방향키를 누르면 
		// 쓰레드 생성이 된다.
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(left) {
					setIcon(playerL);
					x =  x - SPEED;
					setLocation(x,y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
			}
		}).start();	
	}


	@Override
	public void right() {
		pWay = PlayerWay.RIGHT;
		right = true;
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(right) {
					setIcon(playerR);
					x = x + SPEED;
					setLocation(x,y);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}//end of while
				
			}
		}).start();
	}


	@Override
	public void up() {
		System.out.println("점프 ! ");
		up = true;
		new Thread(new Runnable() {
			
			// 반복되면서 애니메이션 처럼 올라가면서 이미지가 찍히면서 효과를 준다.
			//y값이 줄어들면서 캐릭터가 올라가는데 너무 빨라서 보는사람 입장에서는 동영상처럼 올라가는것처럼 보인다.
			
			//JUMPSPEED =65
			@Override
			public void run() {
				for(int i = 0; i < 130 / JUMPSPEED ; i++) {
					y = y - JUMPSPEED;
					setLocation(x , y);
					 
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} //end of for
				
				up = false;
				down();
				
			}
		}).start();
	}


	@Override
	public void down() {
		down = true;
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				while(down) {
					y = y+ JUMPSPEED;
					setLocation(x,y);
					
					try {
						//상대방이 쉬고 있는 타임에 뚫고 들어가는 버그가 생길수 있다.
						Thread.sleep(3);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} //end of while
				down = false;
				
				// 상태값 다룰 때는 상황이 변하면 초기화 처리를 잘 해줘야 한다.
			}
		}).start();
	}
	
	public void attack() {
		
		Bubble bubble = new Bubble(this);
		//부모에 있는 .add();
		mContext.add(bubble);
	}
	
}
