package test;

import java.util.Scanner;

public class Test2{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int fage = scanner.nextInt();
		while(true) {
			System.out.println("메뉴 0.종료 1시작");
			switch(fage) {
			case 0 : System.out.println("게임종료");return;
			case 1 : System.out.println("게임 중");break;
			
			}
		}
	}
}