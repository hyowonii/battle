package Weapon;

import Interface.Shootable;
import Player.Player;

public class �� extends Weapon implements Shootable {
    
    int �Ѿ�power = 100;
    private int �Ѿ˰���;
    
    public ��() {}
    
    public ��(String name) {
    	this.name = name;
    	this.setPower(50);
    	this.set�Ѿ˰���(5);
    }

    public int getBulletPower(){
        return this.�Ѿ�power;
    }

    public void shoot(Player target){
    }

    public void attack(Player target){
    }

	public int get�Ѿ˰���() {
		return �Ѿ˰���;
	}

	public void set�Ѿ˰���(int �Ѿ˰���) {
		this.�Ѿ˰��� = �Ѿ˰���;
	}

}
