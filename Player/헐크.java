
package Player;

import java.util.Scanner;

import Interface.Hitable;
import Interface.Throoowable;
import View.무기고르기_헐크;

import Weapon.돌멩이;
import Weapon.망치;
import Weapon.총;
import Weapon.활;

public class 헐크 extends Player implements Hitable, Throoowable {
	Scanner scanner = new Scanner(System.in);
	총 gun = new 총("총");
	망치 hammer = new 망치("망치");
	활 arrow = new 활("활");
	돌멩이 stone = new 돌멩이("돌멩이");
	
	public 헐크() {}
	
	public 헐크(String name) {
		super(name);
		this.setPower(150);
		this.setHp(1000);
		this.imgFile="C:\\Users\\USER\\Pictures\\헐크1.png";
		this.ws.add(gun);
		this.ws.add(hammer);
		this.ws.add(arrow);
		this.ws.add(stone);
	}
	
	public void 무기선택() {
		무기고르기_헐크 헐크무기 = new 무기고르기_헐크(this);
		헐크무기.setVisible(true);
	}
	
    public void 던지기(Player target){
    	System.out.println(this.name+"의 던지기 공격: 공격력은 무기power");
    	int power = this.getWeapon().getPower();
    	target.setHp(target.getHp()-power);
    }

    public void 때리기(Player target){
    	System.out.println(this.name+"의 때리기 공격: 공격력은 헐크power");
    	int power = this.getPower();
    	target.setHp(target.getHp()-power);
    }

    public void attack(Player target) {
    	this.때리기(target);
    }
    
    public void 무기attack(Player target) {
    	this.던지기(target);
    }
}
