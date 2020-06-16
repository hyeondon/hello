package sample;

public interface SampleService {
	public void join(Sample sample);         
	public String login(Sample sample);
	public Sample[] list();
	public String existid(Sample sample);
	public String searchid(Sample sample);   // 아이디검색
	public String cntid(Sample sample);      // 회원탈퇴
	public String namesearch(Sample sample); // 이름검색
	public Sample[] flist();                 // 전체 회원수
	public String mypage(Sample sample);     // 마이페이지
	public String changepw(Sample sample);   // 비밀번호 변경 
}
/*
 * 요구사항 (기능정의)
 * <사용자기능>
 * 1. 회원가입
 * 2. 로그인
 * 3. 비번 수정
 * 4. 회원탈퇴
 * 5. 아이디 존재 체크
 * 6. 마이페이지
 * **********
 * <관리자기능>
 * 7. 회원목록
 * 8. 아이디검색
 * 9. 이름검색
 * 10. 전체 회원수
 * */