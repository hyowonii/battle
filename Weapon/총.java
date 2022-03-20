package Weapon;

import Interface.Shootable;
import Player.Player;

public class ÃÑ extends Weapon implements Shootable {
    
    int ÃÑ¾Ëpower = 100;
    private int ÃÑ¾Ë°³¼ö;
    
    public ÃÑ() {}
    
    public ÃÑ(String name) {
    	this.name = name;
    	this.setPower(50);
    	this.setÃÑ¾Ë°³¼ö(5);
    }

    public int getBulletPower(){
        return this.ÃÑ¾Ëpower;
    }

    public void shoot(Player target){
    }

    public void attack(Player target){
    }

	public int getÃÑ¾Ë°³¼ö() {
		return ÃÑ¾Ë°³¼ö;
	}

	public void setÃÑ¾Ë°³¼ö(int ÃÑ¾Ë°³¼ö) {
		this.ÃÑ¾Ë°³¼ö = ÃÑ¾Ë°³¼ö;
	}

}
