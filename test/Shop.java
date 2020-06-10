package test;

	public class Shop{

		 private String name;
		 private int phone,tv,computer,sum,total;

		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return this.name;
		}

		public void setPhone(int phone) {
			this.phone = phone;
		}
		public int getPhone() {
			return this.phone;
		}

		public void setTv(int tv) {
			this.tv = tv;
		}
		public int getTv() {
			return this.tv;
		}

		public void setComputer(int computer) {
			this.computer = computer;
		}
		public int getComputer() {
		return this.computer;
		}

		public void sum() {
			this.sum = this.phone + this.tv + this.computer;


		}																															
		void printStates() {
			System.out.println("이름:"+name+ ",폰가격:"+phone+",tv가격:"+tv+",컴퓨터가격:"+computer);
			System.out.println("홍길동님 결제하실 총 금액은? "+ sum +" 입니다");

		}
		}
