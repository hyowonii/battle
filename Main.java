
import java.util.Scanner;

import Player.Player;
import Player.��������;
import Player.�丣;
import Player.��ũ;
import Player.ȣũ����;


public class Main {
	static Player p1, p2;
	
	private static void player�����ϱ�() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i,j;
		
		System.out.print("ù��° Player�� �����ϼ���(1.��ũ 2.�丣 3.�������� 4.ȣũ����): ");
		i = scanner.nextInt()-1;
		if(i==0) { ��ũ ��ũ = new ��ũ("��ũ"); p1 = ��ũ; }
		else if(i==1) { �丣 �丣 = new �丣("�丣"); p1 = �丣; }
		else if(i==2) { �������� �������� = new ��������("��������"); p1 = ��������; }
		else { ȣũ���� ȣũ���� = new ȣũ����("ȣũ����"); p1 = ȣũ����; }
		System.out.println(p1.name+" ����!");
		System.out.println(p1.name+"�� hp: "+p1.getHp());
		System.out.println(p1.name+"�� power: "+p1.getPower());
		System.out.println();
		
		System.out.print("�ι�° Player�� �����ϼ���(1.��ũ 2.�丣 3.�������� 4.ȣũ����): ");
		j = scanner.nextInt()-1;
		if(j==0) { ��ũ ��ũ = new ��ũ("��ũ"); p2 = ��ũ; }
		else if(j==1) { �丣 �丣 = new �丣("�丣"); p2 = �丣; }
		else if(j==2) { �������� �������� = new ��������("��������"); p2 = ��������; }
		else { ȣũ���� ȣũ���� = new ȣũ����("ȣũ����"); p2 = ȣũ����; }
		System.out.println(p2.name+" ����!");
		System.out.println(p2.name+"�� hp: "+p2.getHp());
		System.out.println(p2.name+"�� power: "+p2.getPower());
		System.out.println();
	}
	
	public static void main (String [] args) {
		int k=1;
				
		System.out.println("============Battle Start!============");
		player�����ϱ�();
		
				
		while(true) {
			System.out.println("=================Round "+k+": "+p1.name+"vs"+p2.name+"=================");
			System.out.print(p1.name+"�� ");
			p1.attack(p2);
			System.out.println(p2.name+"�� hp: "+p2.getHp());
			if(p2.getHp()<=0) {
				System.out.println(p2.name+" die");
				break;
			}
		
			System.out.print(p2.name+"�� ");
			p2.attack(p1);
			System.out.println(p1.name+"�� hp: "+p1.getHp());
			if(p1.getHp()<=0) {
				
				System.out.println(p1.name+" die");
				break;
			}
			k++;
		}
		
	}

	

}
