package Weapon;

import Interface.Throoowable;
import Player.Player;

public class 倒告捞 extends Weapon implements Throoowable {

	public 倒告捞() {	}
	
	public 倒告捞(String name) {
		this.name = name;
		this.setPower(150);
	}
	
	@Override
	public void 带瘤扁(Player taget) {
		// TODO Auto-generated method stub
		
	}

}
