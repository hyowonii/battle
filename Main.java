
import java.util.Scanner;

import Player.Player;
import Player.블랙위도우;
import Player.토르;
import Player.헐크;
import Player.호크아이;


public class Main {
	static Player p1, p2;
	
	private static void player선택하기() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i,j;
		
		System.out.print("첫번째 Player를 선택하세요(1.헐크 2.토르 3.블랙위도우 4.호크아이): ");
		i = scanner.nextInt()-1;
		if(i==0) { 헐크 헐크 = new 헐크("헐크"); p1 = 헐크; }
		else if(i==1) { 토르 토르 = new 토르("토르"); p1 = 토르; }
		else if(i==2) { 블랙위도우 블랙위도우 = new 블랙위도우("블랙위도우"); p1 = 블랙위도우; }
		else { 호크아이 호크아이 = new 호크아이("호크아이"); p1 = 호크아이; }
		System.out.println(p1.name+" 생성!");
		System.out.println(p1.name+"의 hp: "+p1.getHp());
		System.out.println(p1.name+"의 power: "+p1.getPower());
		System.out.println();
		
		System.out.print("두번째 Player을 선택하세요(1.헐크 2.토르 3.블랙위도우 4.호크아이): ");
		j = scanner.nextInt()-1;
		if(j==0) { 헐크 헐크 = new 헐크("헐크"); p2 = 헐크; }
		else if(j==1) { 토르 토르 = new 토르("토르"); p2 = 토르; }
		else if(j==2) { 블랙위도우 블랙위도우 = new 블랙위도우("블랙위도우"); p2 = 블랙위도우; }
		else { 호크아이 호크아이 = new 호크아이("호크아이"); p2 = 호크아이; }
		System.out.println(p2.name+" 생성!");
		System.out.println(p2.name+"의 hp: "+p2.getHp());
		System.out.println(p2.name+"의 power: "+p2.getPower());
		System.out.println();
	}
	
	public static void main (String [] args) {
		int k=1;
				
		System.out.println("============Battle Start!============");
		player선택하기();
		
				
		while(true) {
			System.out.println("=================Round "+k+": "+p1.name+"vs"+p2.name+"=================");
			System.out.print(p1.name+"의 ");
			p1.attack(p2);
			System.out.println(p2.name+"의 hp: "+p2.getHp());
			if(p2.getHp()<=0) {
				System.out.println(p2.name+" die");
				break;
			}
		
			System.out.print(p2.name+"의 ");
			p2.attack(p1);
			System.out.println(p1.name+"의 hp: "+p1.getHp());
			if(p1.getHp()<=0) {
				
				System.out.println(p1.name+" die");
				break;
			}
			k++;
		}
		
	}

	

}
