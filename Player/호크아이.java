package Player;

import java.util.Scanner;

import Interface.Kickable;
import Interface.Shootable;
import View.무기고르기_호크아이;
import Weapon.활;

public class 호크아이 extends Player implements Shootable, Kickable {
	Scanner scanner = new Scanner(System.in);
	활 리커브보우 = new 활("리커브보우");
	
	public 호크아이() {}
	
	public 호크아이(String name) {
		this.name = name;
		this.setPower(80);
		this.setHp(1000);
		this.imgFile="C:\\Users\\USER\\Pictures\\호크아이2.png";
		this.ws.add(리커브보우);
	}
	
	public void 무기선택() {
		리커브보우.set화살개수(5);
		무기고르기_호크아이 호크무기 = new 무기고르기_호크아이(this);
		호크무기.setVisible(true);
	}

    public void shoot(Player target){
    	if(리커브보우.get화살개수()>0) {
    		System.out.print(this.name+"의 활쏘기 공격: 공격력은 화살의 bulletPower");
    		int power = this.getWeapon().getBulletPower();
    		target.setHp(target.getHp()-power);
    		리커브보우.set화살개수(리커브보우.get화살개수() - 1);
    		System.out.println(", 남은 화살: "+리커브보우.get화살개수()+"개");
    	}
    	else System.out.println("화살 없음");
    	
    }
    
    public void 발차기(Player target) {
    	System.out.println(this.name+"의 발차기 공격: 공격력은 호크아이power");
    	int power = this.getPower();
    	target.setHp(target.getHp()-power);
    }

    public void attack(Player target) {
    	this.발차기(target);
    }
    
    public void 무기attack(Player target) {
    	this.shoot(target);
    }
}
