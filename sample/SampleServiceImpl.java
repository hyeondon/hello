package sample;

import java.util.Scanner;


public class SampleServiceImpl implements SampleService{
	private Sample[] samples; // 배열
	private int count;
	
	public SampleServiceImpl() {
		samples = new Sample[3];
		count = 0;
	}
	
	@Override
	public void join(Sample sample) {
		samples[count] = sample;
		count++; // 수열
	}

	@Override
	public String login(Sample sample) { // 로그인 
		String result = "FAIL";
		for(int i=0; i<count; i++) {
			if(sample.getUserid().equals(samples[i].getUserid())
					&&
					sample.getPassword().equals(samples[i].getPassword())) {
					result = "SUCCESS";
				break;
			}
		}
		return result;
	}
	@Override // 회원목록
	public Sample[] list() {
		return samples;
	}

	@Override // 아이디 체크
	public String existid(Sample sample) {
		System.out.println("중복체크할 아이디: "+sample.getUserid());
		String result = "중복없음";
		for(int i=0; i<count; i++) {
			if(sample.getUserid().equals(samples[i].getUserid())) {
				result = "중복된 아이디";
			}
		}
		return result;
	}

	@Override // 아이디 검색
	public String Searchid(Sample sample) {
		System.out.println("검색할 아이디: "+sample.getUserid());
		String result = "아이디 없음";
		for(int i=0; i<count; i++) {
			if(sample.getUserid().equals(samples[i].getUserid())) {
				result = "아이디 있음";
			}
		}
		return result;
	}

	@Override // 회원탈퇴
	public String Cntid(Sample sample) {
		System.out.println("회원탈퇴 아이디 입력: ");
		int idx = -1;
		String delid = sample.getUserid();
		System.out.println("비밀번호 입력: ");
		String delpw = sample.getUserid();
		for(int i=0; i<count; i++) {
			
				idx = i;
			}
		
		return null;
	}

	@Override // 이름검색
	public String namesearch(Sample sample) {
		System.out.println("검색할 이름 : "+sample.getName());
		String result = "등록되지 않은 이름입니다.";
		for(int i=0; i<count; i++) {
			if(sample.getName().equals(samples[i].getName())) {
				result = "등록된 이름입니다.";
			}
		}
		return result;
	}

	@Override // 전체회원 검색 
	public Sample[] Flist() {
		return Flist();
	}

	@Override
	public String mypage(Sample sample) {
		System.out.println("아이디 :"+sample.getUserid());
		return null;
	}
}


