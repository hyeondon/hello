package test;

import java.util.Scanner;
/*
 * * 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램
  * [요구사항] 금융업을 하는 고객사로부터 프로그램 개발요청이 들어왔습니다.
  * 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램입니다.
  * 예를들어, 125,520 원을 입력하면 화면에 이렇게 보이게 하면 됩니다.
  * 표시하고 10원미만은 절삭
   ******************************************************
     요청금액 : 126520 원
     5만원 : 2매
     1만원 : 2매
     5천원 : 1매
     1천원 : 1매
     5백원 : 1개
     백원 : 0개
     오십원 : 0개
     십원 : 2개
   ********************************************************
 * */
class Money{
	int sum = 0;
}

public class MoneyUnit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int[] unit = {50000, 10000, 5000, 1000, 100, 50, 10};
		
		while(true) {
			System.out.println("메뉴 0.종료 1.입금");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료");return;
			case 1 : 
			System.out.println("입금하였습니다.");
			int money = scanner.nextInt();
			for(int i=0; i<unit.length; i++) {
			System.out.println("만원");
			}
			}
		}
	}
	
}
		
	


