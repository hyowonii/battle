package Weapon;
import Interface.Shootable;
import Player.Player;

public class Ȱ extends Weapon implements Shootable {
    
    int ȭ��power = 100;
    private int ȭ�찳��;
    
    public Ȱ() {}
    
    public Ȱ(String name) {
    	this.name = name;
    	this.setPower(50);
    	this.setȭ�찳��(5);
    }

    public int getBulletPower(){
        return this.ȭ��power;
    }

    public void shoot(Player target){
    }

    public void attack(Player target){
    }

	public int getȭ�찳��() {
		return ȭ�찳��;
	}

	public void setȭ�찳��(int ȭ�찳��) {
		this.ȭ�찳�� = ȭ�찳��;
	}

}
