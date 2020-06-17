package matrix;

import java.awt.image.renderable.RenderableImage;
import java.util.Random;
import java.util.Scanner;

class Lotto{ //호출
	int[] lotto; 
	public boolean isDuplication(int[] lotto, int num) {
		boolean ok = false;
		for(int i=0; i<lotto.length; i++) {
			if(lotto[i] == num ) ok = true;
		}
		return ok;
	}
	public static void generator(Random random, int[] lotto, Lotto instance) {
		for(int i=0; i<lotto.length; i++) {
			int temp = random.nextInt(45)+1; 
			System.out.printf("뽑힌 값: %d\n",temp);
			if(instance.isDuplication(lotto, temp)) {
			i--;
			continue;
		}
		lotto[i] =temp;
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
			System.out.println("메뉴판 0.종료 1.로또구입");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료");return;
			case 1 : System.out.println("로또구입");
			System.out.println("얼마치를 구입합니까?");	
			int money = scanner.nextInt();
			System.out.printf("구매금액은%d 입니다\n", money);
			int lottocount =0;
			if(money < 1000) {
				System.out.println("잘못된 값");
			} else {
				if(money > 5000) {
					lottocount = 5;
				}else {
					lottocount = money/1000;
				}
			}
			System.out.printf("로또%d장을 발급합니다",lottocount);
			instance.generator(random, lotto, instance);
		}
			}
		}
		
		/*
		for(int i=0; i<lotto.length; i++) {
		System.out.printf("%d\t",lotto[i]);
		}
		*/
		}

