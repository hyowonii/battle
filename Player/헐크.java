
package Player;

import java.util.Scanner;

import Interface.Hitable;
import Interface.Throoowable;
import View.�������_��ũ;

import Weapon.������;
import Weapon.��ġ;
import Weapon.��;
import Weapon.Ȱ;

public class ��ũ extends Player implements Hitable, Throoowable {
	Scanner scanner = new Scanner(System.in);
	�� gun = new ��("��");
	��ġ hammer = new ��ġ("��ġ");
	Ȱ arrow = new Ȱ("Ȱ");
	������ stone = new ������("������");
	
	public ��ũ() {}
	
	public ��ũ(String name) {
		super(name);
		this.setPower(150);
		this.setHp(1000);
		this.imgFile="C:\\Users\\USER\\Pictures\\��ũ1.png";
		this.ws.add(gun);
		this.ws.add(hammer);
		this.ws.add(arrow);
		this.ws.add(stone);
	}
	
	public void ���⼱��() {
		�������_��ũ ��ũ���� = new �������_��ũ(this);
		��ũ����.setVisible(true);
	}
	
    public void ������(Player target){
    	System.out.println(this.name+"�� ������ ����: ���ݷ��� ����power");
    	int power = this.getWeapon().getPower();
    	target.setHp(target.getHp()-power);
    }

    public void ������(Player target){
    	System.out.println(this.name+"�� ������ ����: ���ݷ��� ��ũpower");
    	int power = this.getPower();
    	target.setHp(target.getHp()-power);
    }

    public void attack(Player target) {
    	this.������(target);
    }
    
    public void ����attack(Player target) {
    	this.������(target);
    }
}
