package test;

import java.util.Scanner;

public 	class GradeDemo2{
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int[] arr = new int[3];
			
			for(int i=0; i<3; i++) {
				System.out.println("학생점수: ");
				arr[i] = scanner.nextInt();
			}
				int show = 0;
				// 메소드 내부를 area라고 하는데, 자연변수는 반드시 초기화 해야한다.
				// 클래스 내부를 field 라고 하는데, 인스턴스변수는 반드시 초기화 하면 안된다.
				// 지역변수의 값을 받아서 초기화 한다.
				if(arr[0] > arr[1] && arr[0] > arr[2]) {
					show = arr[0];
				}else if(arr[1] > arr[0] && arr[1] > arr[2]) {
					show = arr[1];
				}else {
					show = arr[2];
				}
				System.out.println("1등 점수는: "+show);
			}
		}

