package Weapon;
import Interface.Shootable;
import Player.Player;

public class 활 extends Weapon implements Shootable {
    
    int 화살power = 100;
    private int 화살개수;
    
    public 활() {}
    
    public 활(String name) {
    	this.name = name;
    	this.setPower(50);
    	this.set화살개수(5);
    }

    public int getBulletPower(){
        return this.화살power;
    }

    public void shoot(Player target){
    }

    public void attack(Player target){
    }

	public int get화살개수() {
		return 화살개수;
	}

	public void set화살개수(int 화살개수) {
		this.화살개수 = 화살개수;
	}

}
