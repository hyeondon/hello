package phone;

import java.util.Scanner;

/**
 @author qpwlxm123@gmail.com 
 @since 2020.06.18
 @param kind 종류, company 제조사, call 통화내역
 */
class BelPhone{
	protected String kind, company, call;
	
	public String getKind() {return kind;}
	public void setKind(String kind) {this.kind = kind;}
	public String getCompany() {return company;}
	public void setCompany(String company) {this.company = company;}
	public String getCall() {return call;}
	public void setCall(String call) {this.call = call;}

	@Override 
	public String toString() {
		return "집전화기 [폰종류=" + kind + ","
				+ " 제조사=" + company + ","
						+ " 통화내역=" + call + "]";
	}
}

class CelPhone extends BelPhone{
	public final static String KIND = "휴대폰";
	protected boolean portable;
	protected String move;

	public boolean isPortable() {return portable;}
	public void setPortable(boolean portable) {
//		if(portable) {move = "이동가능";
//		}else {move = "이동 불가능";}
		move =(portable) ? "이동중에":"이동불가능"; // 삼항 연산자 
		this.portable = portable;
		}
	public String getMove() {return move;}
	public void setMove(String move) {this.move = move;}
	@Override
	public String toString() {
		return String.format("%s 인 %s 제품을 사용해서 %s 라고 %s 통화한다", 
				KIND,super.company,super.call,move);
	
	}
}

public class Phone { 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BelPhone phone = null;
		BelPhone[] arr = new BelPhone[1];
		CelPhone cel = null;
		while(true) {
			System.out.println("0.종료 1.집전화걸기 2.전화받기 3.휴대폰걸기");
			switch (scanner.nextInt()) {
			case 0: return;
			case 1: 
				phone = new BelPhone();
				phone.setKind("집전화");	
				phone.setCompany("금성사");
				phone.setCall("안녕하세요");
				arr[0] = phone;
				break;
			case 2:
				System.out.println(arr[0].toString());
			case 3 :
				cel = new CelPhone();
				cel.setCompany("노키아");
				cel.setPortable(true);
				cel.setCall("이동중에 통화하고 있다.");
				arr[0] = cel;
				
			default:
				break;
			}
		}
	}
}

