package Player;

import java.util.Scanner;

import Interface.Hitable;
import Interface.Throoowable;
import View.무기고르기_토르;
import Weapon.묠니르;
import Weapon.돌멩이;

public class 토르 extends Player implements Hitable, Throoowable {
	Scanner scanner = new Scanner(System.in);
	묠니르 묠니르 = new 묠니르("묠니르");
	돌멩이 돌멩이 = new 돌멩이("돌멩이");
	
	public 토르() {}
	
	public 토르(String name) {
		this.name = name;
		this.setPower(100);
		this.setHp(1000);
		this.imgFile="C:\\Users\\USER\\Pictures\\토르3.png";
		this.ws.add(묠니르);
		this.ws.add(돌멩이);
	}

	public void 무기선택() {
		무기고르기_토르 토르무기 = new 무기고르기_토르(this);
		토르무기.setVisible(true);
	}
	
	@Override
	public void 던지기(Player target) {
		// TODO Auto-generated method stub
		System.out.println(this.name+"의 던지기 공격: 공격력은 무기power");
    	int power = this.getWeapon().getPower();
    	target.setHp(target.getHp()-power);
	}

	@Override
	public void 때리기(Player target) {
		// TODO Auto-generated method stub
		System.out.println(this.name+"의 때리기 공격: 공격력은 토르power");
    	int power = this.getPower();
    	target.setHp(target.getHp()-power);
	}
	
	public void attack(Player target) {
		this.때리기(target);
	}

	@Override
	public void 무기attack(Player target) {
		// TODO Auto-generated method stub
		this.던지기(target);
	}


}
