package test;
class Member{
	String grade;
	String name;
	public Member(String name) {
		this.name = name;
	}
	public String getName() {return name;}
	public void setName(String n) {this.name = name;}
	public String getGrade() {return grade;}
	public void setGrade(String g) {this.grade = grade;}
	public void hello() {
		System.out.printf("안녕하세요 %s입니다.%n",name);
	}
}
class SpecialMember extends Member{
	int specialPoint;
	public int getSpecialPoint() {
		return specialPoint;
	}
	public SpecialMember(String name) {
		super(name);
	}
	void setSpecialPoint(int a) {
		specialPoint = a;
	}
	public void hello() {
		System.out.printf("안녕하세요 스페셜멤버 %s입니다.%n",name);
	}
}
public class T {
	public static void main(String[] args) {
		Member m = new Member("김길동");
		m.setGrade("3");
		m.hello();
		
		SpecialMember sm = new SpecialMember("홍길동");
		sm.setGrade("1");
		sm.setSpecialPoint(100);
		
		Member m2 = sm;
		m2.hello();
	}
}
