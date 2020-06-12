package rps;

import java.util.Scanner;

public class WhileDemo{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴를 선택하세요. y.게임시작 n.게임종료");
			switch(scanner.next()) {
			case "y" : System.out.println("게임 중..");break;
			case "n" : System.out.println("게임종료");return;
			}
		}
	}
}