package Player;

import java.util.Scanner;

import Interface.Kickable;
import Interface.Shootable;
import View.무기고르기_블랙위도우;
import Weapon.총;

public class 블랙위도우 extends Player implements Kickable, Shootable {
	Scanner scanner = new Scanner(System.in);
	총 권총 = new 총("권총");
	
	public 블랙위도우() {}
	
	public 블랙위도우(String name) {
		this.name = name;
		this.setPower(80);
		this.setHp(1000);
		this.imgFile="C:\\Users\\USER\\Pictures\\그림2 (4).png";
		this.ws.add(권총);
	}
	
	 public void 무기선택() {
		권총.set총알개수(5);
		무기고르기_블랙위도우 블위무기 = new 무기고르기_블랙위도우(this);
		블위무기.setVisible(true);
	}
	
	@Override
	public void shoot(Player target) {
		// TODO Auto-generated method stub
		if(권총.get총알개수()>0) {
			System.out.print(this.name+"의 총쏘기 공격: 공격력은 총알의 bulletPower");
			int power = this.getWeapon().getBulletPower();
			target.setHp(target.getHp()-power);
			권총.set총알개수(권총.get총알개수() - 1);
			System.out.println(", 남은총알: "+권총.get총알개수()+"개");
		}
		else System.out.println("총알 없음");
		
	}

	@Override
	public void 발차기(Player target) {
		// TODO Auto-generated method stub
		System.out.println(this.name+"의 발차기 공격: 공격력은 블랙위도우power");
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
