package Player;

import java.util.Scanner;

import Interface.Kickable;
import Interface.Shootable;
import View.�������_��������;
import Weapon.��;

public class �������� extends Player implements Kickable, Shootable {
	Scanner scanner = new Scanner(System.in);
	�� ���� = new ��("����");
	
	public ��������() {}
	
	public ��������(String name) {
		this.name = name;
		this.setPower(80);
		this.setHp(1000);
		this.imgFile="C:\\Users\\USER\\Pictures\\�׸�2 (4).png";
		this.ws.add(����);
	}
	
	 public void ���⼱��() {
		����.set�Ѿ˰���(5);
		�������_�������� �������� = new �������_��������(this);
		��������.setVisible(true);
	}
	
	@Override
	public void shoot(Player target) {
		// TODO Auto-generated method stub
		if(����.get�Ѿ˰���()>0) {
			System.out.print(this.name+"�� �ѽ�� ����: ���ݷ��� �Ѿ��� bulletPower");
			int power = this.getWeapon().getBulletPower();
			target.setHp(target.getHp()-power);
			����.set�Ѿ˰���(����.get�Ѿ˰���() - 1);
			System.out.println(", �����Ѿ�: "+����.get�Ѿ˰���()+"��");
		}
		else System.out.println("�Ѿ� ����");
		
	}

	@Override
	public void ������(Player target) {
		// TODO Auto-generated method stub
		System.out.println(this.name+"�� ������ ����: ���ݷ��� ��������power");
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
