package race2;

import java.util.Scanner;

public class PlayerApp1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player1[] player1s = new Player1[3];
		
		for(int i=0; i<player1s.length; i++) {
			Player1 playaer1 = new Player1();
			
			System.out.println("�̸��� �Է��ϼ���: ");
			playaer1.setName(scanner.next());
			
			System.out.println("100M ���: ");
			playaer1.setRecode(scanner.nextInt());
			
			player1s[i] = playaer1;
		}
		for(int i=0; i<player1s.length; i++) {
			player1s[i].printStates();
		}
	}
}
