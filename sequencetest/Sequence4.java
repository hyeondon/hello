package sequencetest;
// ace를 출력하세요. 
public class Sequence4 {
	public static void main(String[] args) {
		String[] names = {"a","b","c","d","e"};
		String ace ="";
		int i = 0;
		
		while(true) {
			if(i<names.length) {
				if(i % 2 == 0) ace += names[i];{
			}
			i++;
		}else {
			break;
		}
			System.out.println(ace);
		}
	}
}
