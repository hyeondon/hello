package race;
import java.util.Scanner;

public class PlayerApp { // Ŭ��������, Ű���� ���̵� {}
	public static void main(String[] args) { // �޼ҵ�����, Ű���� ���̵�() {}
		Scanner scanner = new Scanner(System.in); // ;���� ������ statement 
		Player[] players = new Player[3];
		
		for(int i=0; i<3; i++) { // {���� ������ cf statement 
			Player player = new Player();
			
			System.out.println("Player �̸��� �Է��ϼ���: ");
			player.setName(scanner.next()); 
			
			System.out.println("����� �Է��ϼ���");
			player.setRecord(scanner.nextInt());
			
			players[i] = player;
		}
			for(int i=0; i<3; i++) {
				players[i].printStates();
			}
	}
}
