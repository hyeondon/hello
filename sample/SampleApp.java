package sample;

import java.util.Scanner;

public class SampleApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Sample sample = null;
		SampleService sampleService = new SampleServiceImpl();
		while(true) {
			System.out.println("메뉴: 0.종료 1.회원가입 2.로그인 3.회원목록");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료");return;
			case 1 : 
				sample = new Sample();//객체
				System.out.println("회원가입");
				System.out.println("아이디: ");
				sample.setUserid(scanner.next());
				System.out.println("비밀번호: ");
				sample.setPassword(scanner.next());
				System.out.println("이름: ");
				sample.setName(scanner.next());
				sampleService.join(sample); //요소 
				break;
				
			case 2 : 
				System.out.println("로그인");
				sample = new Sample();
				System.out.println("아이디: ");
				sample.setUserid(scanner.next());
				System.out.println("비밀번호: ");
				sample.setPassword(scanner.next());
				sampleService.login(sample);
				break;
				
			case 3 :
				System.out.println("회원목록보기");
				Sample[] list = sampleService.list();
				for(int i=0; i<3; i++) {
					System.out.println(list[i].toShow());
				}
				default : 
					System.out.println("메뉴가 없는 기능입니다.");
					break;
				
			}
		}
	}
}
