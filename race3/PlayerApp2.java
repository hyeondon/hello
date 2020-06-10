package race3;

import java.util.Scanner;

import sun.net.www.content.text.plain;

public class PlayerApp2{
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Player2[] Player2s = new Player2[3];
			
			for(int i=0; i<Player2s.length; i++) {
				Player2 player2 = new Player2();
				
				System.out.println("이름을 입력하세요: ");
				player2.setName(scanner.next());
				
				System.out.println("100M 기록을 입력하세요: ");
				player2.setRecode2(scanner.nextInt());
				
				Player2s[i] = player2;
			}
			for(int i=0; i<Player2s.length; i++) {
				Player2s[i].showPlayer2();
			}
			Player2[] ranking = new Player2[3];
			if(Player2s[0].getRecode2() < Player2s[1].getRecode2()) {
				if(Player2s[0].getRecode2() < Player2s[2].getRecode2()) {
					ranking[0] = Player2s[0];
				}else {
					ranking[0] = Player2s[2];
				}
			}
			else {
				if(Player2s[0].getRecode2() < Player2s[2].getRecode2()) {
					ranking[0] = Player2s[2];
				}
			}
				System.out.println("1등은 " +ranking[0].getRecode2());
		}
		
}