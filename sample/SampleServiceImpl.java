package sample;

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
	public void login(Sample sample) {
		for(int i=0; i<count; i++) {
			if(sample.getUserid().equals(samples[i].getUserid())
					&&
					sample.getPassword().equals(samples[i].getPassword())) {
				System.out.println("로그인 성공");
				break;
			}else {
				System.out.println("로그인 실패");
			}
		}
	}
	@Override
	public Sample[] list() {
		return samples;
	}

}
