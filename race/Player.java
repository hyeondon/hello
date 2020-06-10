package race;

public class Player {
	private String name; 
	private int record;
	
		public void setName(String name) { //키워드(){} Condition
			this.name = name;
		}
		public String getName() { 
			return this.name;
		}
		
		public void setRecord(int record) {
			this.record = record;
		}
		
		public int gerRecord() {
			return this.record;
		}
	
	void printStates() {
		System.out.println("이름:"+name+",기록:"+record);
	}
	
}
