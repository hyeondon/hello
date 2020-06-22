package test;

import java.util.Scanner;

public class T {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어=");
		int kor = scanner.nextInt();
		System.out.println("영어=");
		int eng = scanner.nextInt();
		System.out.println("수학=");
		int math = scanner.nextInt();
		
		int sum = kor+eng+math;
		float avg = sum/3.0f;
		
		System.out.printf("총점: %d점%n",sum);
		System.out.printf("평균: %.2f점%n", avg);
	}
}
