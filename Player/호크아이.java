package Player;

import java.util.Scanner;

import Interface.Kickable;
import Interface.Shootable;
import View.�������_ȣũ����;
import Weapon.Ȱ;

public class ȣũ���� extends Player implements Shootable, Kickable {
	Scanner scanner = new Scanner(System.in);
	Ȱ ��Ŀ�꺸�� = new Ȱ("��Ŀ�꺸��");
	
	public ȣũ����() {}
	
	public ȣũ����(String name) {
		this.name = name;
		this.setPower(80);
		this.setHp(1000);
		this.imgFile="C:\\Users\\USER\\Pictures\\ȣũ����2.png";
		this.ws.add(��Ŀ�꺸��);
	}
	
	public void ���⼱��() {
		��Ŀ�꺸��.setȭ�찳��(5);
		�������_ȣũ���� ȣũ���� = new �������_ȣũ����(this);
		ȣũ����.setVisible(true);
	}

    public void shoot(Player target){
    	if(��Ŀ�꺸��.getȭ�찳��()>0) {
    		System.out.print(this.name+"�� Ȱ��� ����: ���ݷ��� ȭ���� bulletPower");
    		int power = this.getWeapon().getBulletPower();
    		target.setHp(target.getHp()-power);
    		��Ŀ�꺸��.setȭ�찳��(��Ŀ�꺸��.getȭ�찳��() - 1);
    		System.out.println(", ���� ȭ��: "+��Ŀ�꺸��.getȭ�찳��()+"��");
    	}
    	else System.out.println("ȭ�� ����");
    	
    }
    
    public void ������(Player target) {
    	System.out.println(this.name+"�� ������ ����: ���ݷ��� ȣũ����power");
    	int power = this.getPower();
    	target.setHp(target.getHp()-power);
    }

    public void attack(Player target) {
    	this.������(target);
    }
    
    public void ����attack(Player target) {
    	this.shoot(target);
    }
}
