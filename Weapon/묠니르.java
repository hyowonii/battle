package Weapon;

import Interface.Throoowable;
import Player.Player;

public class ���ϸ� extends Weapon implements Throoowable{
	
	public ���ϸ�() {	}
	
	public ���ϸ�(String name) {
		this.name = name;
		this.setPower(200);
	}

	@Override
	public void ������(Player target) {
		// TODO Auto-generated method stub
		
	}

}
