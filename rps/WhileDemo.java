package rps;

import java.util.Scanner;

public class WhileDemo{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int fage = scanner.nextInt();
			System.out.println("메뉴 0.종료 1.시작");
			switch(fage) {
			case 0 : System.out.println("게임종료");return;
			case 1 : System.out.println("게임 중..");break;
			}
		}
	}
}

