package matrix;

import java.util.Random;
import java.util.Scanner;

class Lotto{
	 
	public boolean isDuplication(int[] lotto, int num) {
		boolean ok = false;
		for(int i=0; i < lotto.length; i++) {
			if(lotto[i] == num) ok = true;
		}
		return ok;
	}
	public void generate(Random random, int[] lotto, Lotto instance) {
		for(int i=0; i< lotto.length; i++) {
			int temp = random.nextInt(45)+1;
			System.out.printf("뽑힌 값: %d\n", temp);
			if(instance.isDuplication(lotto, temp)) { 
				i--;
				continue;
			}
			lotto[i] = temp;
		}
	}
	
}

public class LottoApp {
	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[6];
		Scanner scanner = new Scanner(System.in);
		Lotto instance = new Lotto();
		while(true) {
			System.out.println("0.종료 1.로또구입");
			switch(scanner.nextInt()) {
			case 0: System.out.println("종료"); return;
			case 1: System.out.println("로또구입\n");buyLottos(scanner);break;
			}
		}
		
		
		
		
		//instance.generate(random, lotto, instance);
		/*
		for(int i=0; i< lotto.length; i++) {
			System.out.printf("%d\t", lotto[i]);
		}
		*/
	}

	public static void buyLottos(Scanner scanner) {
		System.out.println("얼마치를 구입합니까? ");
		int money = scanner.nextInt();
		System.out.printf("구매금액은 %d원 입니다\n", money);
		int lottoCount = 0;
		if(money < 1000) {
			System.out.println("잘못된 값");
		}else {
			if(money > 5000) {
				lottoCount = 5;
			}else {
				lottoCount = money / 1000;
			}
		}
		System.out.printf("로또 %d장을 발급합니다\n", lottoCount);
	}
}
