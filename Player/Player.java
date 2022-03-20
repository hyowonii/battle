package Player;

import java.util.ArrayList;

import Interface.Attackable;
import Weapon.Weapon;

public abstract class Player implements Attackable {
	
    public String name;
    private int hp;
    private int power;
    private Weapon w;
    public String imgFile=null;
    public ArrayList <Weapon> ws = new ArrayList <Weapon>();
    
    
    public Player() {}
    
    public Player(String name) {
    	this.name = name;
    }

    public void attack(Player target){
    }

	public void 무기attack(Player target) {	
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public Weapon getWeapon() {
		return w;
	}

	public void setWeapon(Weapon w) {
		this.w = w;
	}
	
	public void 무기선택() {}

}
