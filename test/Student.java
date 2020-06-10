package test;

	public class Student{
		private String name;
		private int kor,eng,math,sum;
		float avg;

		//이름 
		public void setName(String name) {
			this.name = name;
		}

		public String gerName() {
			return this.name;
		}
		//국어 
		public void setKor(int kor) {
			this.kor = kor;
		}
		public int getKor() {
			return this.kor;
		}
		//영어 
		public void setEng(int eng) {
			this.eng = eng;
		}
		public int getEng() {
			return this.eng;
		}
		//수학 
		public void setMath(int math) {
			this.math = math;
		}
		public int getMath() {
			return this.math;
		}

		public void sum() {
			this.sum = this.kor+this.eng+this.math;
		}

		public void  avg() {
			 this.avg = this.sum / 3;
		}

		void printStates() {
		System.out.println("이름:"+ name +",국어:"+ kor +",영어:"+ eng +",수학:"+ math +"합계:"+ sum +",평균:"+avg);
		}

	} 