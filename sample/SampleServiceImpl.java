package sample;

public class SampleServiceImpl implements SampleService{
	private Sample[] samples;
	private int idx;
	
	public SampleServiceImpl() {
		samples = new Sample[3];
		idx =0;
	}
	
	@Override
	public void join(Sample sample) {
		samples[idx] = sample;
		idx++;
	}

	@Override
	public void login(Sample sample) {
		for(int i=0; i<samples.length; i++) {
			if(sample.getUserid().equals(samples[i].getUserid())
				&& sample.getPassword().equals(samples[i].getPassword())){
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("로그인 실패");
					break;
				}
		}
	}

	@Override
	public Sample[] list() {
		return samples;
	}

}
