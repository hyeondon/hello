package test;
import java.util.Scanner;

public class ShopApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Shop[] shops = new Shop[3];

		for(int i=0; i<shops.length; i++) {
			Shop shop = new Shop();

			System.out.println("고객 3명이 줄을 섰어요.");

			System.out.println("이름:");
			shop.setName(scanner.next());

			System.out.println("폰가격:");
			shop.setPhone(scanner.nextInt());

			System.out.println("tv가격:");
			shop.setTv(scanner.nextInt());

			System.out.println("컴퓨터가격:");
			shop.setComputer(scanner.nextInt());

			System.out.println("OOO님 결제하실 총 금액은 ? ");


			shop.sum();

			shops[i] = shop;
		}
			for(int i=0; i<shops.length; i++) {
				shops[i].printStates();
			}
	}

}
