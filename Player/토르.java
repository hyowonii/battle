package Player;

import java.util.Scanner;

import Interface.Hitable;
import Interface.Throoowable;
import View.�������_�丣;
import Weapon.���ϸ�;
import Weapon.������;

public class �丣 extends Player implements Hitable, Throoowable {
	Scanner scanner = new Scanner(System.in);
	���ϸ� ���ϸ� = new ���ϸ�("���ϸ�");
	������ ������ = new ������("������");
	
	public �丣() {}
	
	public �丣(String name) {
		this.name = name;
		this.setPower(100);
		this.setHp(1000);
		this.imgFile="C:\\Users\\USER\\Pictures\\�丣3.png";
		this.ws.add(���ϸ�);
		this.ws.add(������);
	}

	public void ���⼱��() {
		�������_�丣 �丣���� = new �������_�丣(this);
		�丣����.setVisible(true);
	}
	
	@Override
	public void ������(Player target) {
		// TODO Auto-generated method stub
		System.out.println(this.name+"�� ������ ����: ���ݷ��� ����power");
    	int power = this.getWeapon().getPower();
    	target.setHp(target.getHp()-power);
	}

	@Override
	public void ������(Player target) {
		// TODO Auto-generated method stub
		System.out.println(this.name+"�� ������ ����: ���ݷ��� �丣power");
    	int power = this.getPower();
    	target.setHp(target.getHp()-power);
	}
	
	public void attack(Player target) {
		this.������(target);
	}

	@Override
	public void ����attack(Player target) {
		// TODO Auto-generated method stub
		this.������(target);
	}


}
