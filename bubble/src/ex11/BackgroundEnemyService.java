package ex11;

import java.awt.Color;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// 메인 화면에 그림 그려 주고 있고 (키보드 이벤트 리스너 받고 있어서 바쁨)
// 백그라운드에서 계속 Player에 움직임을 관찰 
public class BackgroundEnemyService implements Runnable {

	private BufferedImage image;
	private Enemy enemy;
	
	private int JUMPCOUNT = 0;
	private int FIRST = 0; //바닥 도착 여부 0, 꼭대기 1
	private int BOTTOMCOLOR = -1;

	public BackgroundEnemyService(Enemy enemy) {
		this.enemy = enemy;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("백그라운드플레이어서비스객체에 사용하는 이미지 경로 및 파일명 확인");
		}
		
	}

	@Override
	public void run() {
		
		while(enemy.getState() == 0) {
			//기준 왼쪽
			Color leftColor = new Color(image.getRGB(enemy.getX(), enemy.getY()));
			//기준 오른쪽
			Color rightColor = new Color(image.getRGB(enemy.getX()+60, enemy.getY()));
			
			//바닥 충돌 감지
			//Color bottomColorLeft = new Color(image.getRGB(player.getX()+10, player.getY()+60));
			// -65536, -16776961, -1
			// x값이 겹치면 벽에 걸린다 해결방법 : 밑에 X값이 더 커야 한다.
			int bottomColorLeft = image.getRGB(enemy.getX()+20, enemy.getY()+55);
			// -65536, -16776961, -1
			int bottomColorRight = image.getRGB(enemy.getX()+ 45,  enemy.getY()+55);
			System.out.println("bottomColorLeft : " +bottomColorLeft);
			System.out.println("bottomColorRight : " +bottomColorRight);
			// -1 , -1 == 공중
			if (bottomColorLeft+bottomColorRight  != -2) {
				enemy.setDown(false);
			}else {
			}
			
			//외벽 충돌 확인
			// 꼭대기 도착
			
			//오른쪽 구석
			
			//왼쪽 구석
		} //end of while
			
	}

} //end of class
