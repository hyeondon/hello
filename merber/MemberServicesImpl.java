package merber;


public class MemberServicesImpl implements MemberService{
	private Member[] members;
	private int idx; 
	
	public MemberServicesImpl() { // 생성자
		members = new Member[3]; 
		idx =0;
	}
	
	@Override
	public void join(Member member) { // set[add]
		System.out.println("*** App에서 넘어온 회원정보 ***");
		System.out.println(member.toString());
		members[idx] = member;
		idx++;
		System.out.println("증가된 인덱스값: "+idx);
		System.out.println("*** 배열에 저장된 회원정보 ****");
		for(int i=0; i<members.length; i++) {
			if(members[i] != null) {
				System.out.println(members[i].toString());
			}else {
				System.out.println("회원정보가 없어요");
			}
		}
	}

	@Override
	public void login() { // get
		
	}

	@Override
	public Member[] list() {
		return members;
	}

}
