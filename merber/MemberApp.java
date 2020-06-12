package merber;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MemberApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = new Member();
		MemberService memberService = new MemberServicesImpl();
			while(true) {
				System.out.println("메뉴 0.종료 1.회원가입 2.로그인");
				switch (scanner.nextInt()) {
				case 0:
						System.out.println("종료");
					return;
				case 1:
					System.out.println("회원가입");
					
					System.out.println("아이디:");
					member.setUserid(scanner.next());
					
					System.out.println("비밀번호:");
					member.setPassword(scanner.next());
					
					System.out.println("이름:");
					member.setName(scanner.next());
					
					System.out.println("*** 회원정보 확인 ***");
					System.out.println(member.toString());
					memberService.join(member);
					break;
					
				case 2:
					System.out.println("로그인");
					break;

				default:
					System.out.println("잘못된 메뉴를 입력하셨습니다.");
					break;
				}
			}
	}
}
