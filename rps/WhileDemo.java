package rps;

import java.util.Scanner;

public class WhileDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴: 1.게임 0.종료");
			int flag = scanner.nextInt();
			switch(flag) {
			case 0 : System.out.println("게임종료"); return;
			case 1 : System.out.println("게임 중"); break;
			}
		}
	}
}


