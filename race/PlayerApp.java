package race;

import java.util.Scanner;



public class PlayerApp { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in); 
		Player[] players = new Player[3]; //������ȣ 

		for(int i=0; i<players.length; i++) { 
			Player player = new Player();
			
			System.out.println("Player �̸��� �Է��ϼ���: ");
			player.setName(scanner.next()); 
			//String name = scanner.next();
			//player.setName(name);
			
			System.out.println("100M ���: ");
			player.setRecord(scanner.nextInt());
			//int record = scanner.nextInt();
			//player.setRecord(record);
			
			players[i] = player;
		}
			for(int i=0; i<players.length; i++) {
				players[i].printStates();
			}
			Player[] ranking = new Player[3]; 
			if(players[0].gerRecord() < players[1].gerRecord()) {
				if(players[0].gerRecord() < players[2].gerRecord()) {
					ranking[0] = players[0];
				}else {
					ranking[0] = players[2];
				}
			}else {
				if(players[1].gerRecord() < players[2].gerRecord()) {
					ranking[0] = players[1];
				} else {
					ranking[0] = players[2];
				}
			}
			System.out.println("1���� "+ ranking[0].getName());
	}
}


/**
 if(players[0].gerRecord() < players[1].gerRecord()) {
				System.out.println(players[0].getName()
						+"��"+players[1].getName()+"���� ������");
			} else {
				System.out.println(players[1].getName()
						+"��"+players[0].getName()+"���� ������");
 **/
 