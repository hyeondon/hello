package week1task;
import java.awt.Graphics;
import java.awt.Point;
/*
  실습: 차량판매시스템
선택하세요. [0:나가기, 1:차량등록, 2:고객등록, 3. 차량조회,//(기본) 
             4: 고객조회, 5:차량판매]도전과제 5번
[차량등록]
차량번호: 111
차량크기(소형(1)/중형(2)/대형(3)): 2
차량타입(세단(1)/SUV(2)): 1

[고객등록]
고객번호: 122
고객명: 홍길동

[차량조회]
차량번호: 111
차량크기(소형(1)/중형(2)/대형(3)): 2
차량타입(세단(1)/SUV(2)): 1
--------------
[고객조회]
고객번호: 111
고객명: 홍길동
-------------
[차량판매]
고객번호를 등록하세요[0:취소]: 122
차량번호를 등록하세요[0:취소]: 111

====================================================================

* 차량등록 시 중복체크
   ‘차량번호가 중복됩니다’

* 차량판매 시
   - 존재하는 고객번호일 때까지 ‘고객번호를 등록하세요’
   - 존재하는 차량번호일 때까지 ‘차량번호를 등록하세요’

  - 판매된 차량번호이면 ‘판매된 차량번호 입니다. 차량번호를 등록하세요’

 * */
import java.util.Scanner;

class Car{
	 int id; // 차량번호
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	int size; // 차량크기
	public void setSize(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	 int type; // 차량타입
	 public void setType(int type) {
		 this.type = type;
	 }
	 public int getType() {
		 return type;
	 }
	
}

class Name extends Car{ // 고객정보
	String name; // 고객명
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	int nameid; //고객번호
	public void setNameid(int nameid) {
		this.nameid = nameid;
	}
	public int getNameid() {
		return nameid;
	}
	
}
class CarSales extends Car{ // 판매차량
	int carsalesid;
	public int getCarsalesid() {
		return carsalesid;
	}
	public void setCarsalesid(int carsalesid) {
		this.carsalesid = carsalesid;
	}
}
class NameidSales extends Name{ // 판매고객
	int nameidsales;
	
	public void setNameidsales(int nameidsales) {
		this.nameidsales = nameidsales;
	}
	public int getNameidsales() {
		return nameidsales;
	}
}

public class CarSalesSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Car[] cars = new Car[100]; // 차량
		Name[] people = new Name[100];// 고객
		CarSales[] sales = new CarSales[100]; //판매차량
		NameidSales[] salesid = new NameidSales[100]; //판매고객
		int count = 0; // 차량 체크
		int cnt = 0; // 고객 체크
		while (true) {
			System.out.println("메뉴>> 0.나가기 1.차량등록 2.고객등록 3.차량조회 4.고객조회 5.차량판매 ");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("나가기"); return;
			case 1 : 
				     Car car = new Car(); // 차량정보
					 System.out.println("차량등록 입니다.");
					 System.out.println("차량번호:");
					 car.setId(scanner.nextInt());
				     System.out.println("차량크기: 소형(1)|중형(2)|대형(3)");
				     car.setSize(scanner.nextInt());
				     System.out.println("차량타입: 세단(1)|SUV(2)");
				     car.setType(scanner.nextInt());
				     cars[count] = car;
				     count++;
				     for(int i=0; i<count-1; i++) {
				    	 if(car.getId() == cars[i].getId()) {
				    		 System.out.println("중복된 차량번호 입니다.");
				    		 count--;
				    	 }else {
				    		 System.out.println("등록완료");
				    	 }
				     }
				     break;
			case 2 : 
					 Name name = new Name(); // 고객정보
					 System.out.println("고객등록 입니다.");
					 System.out.println("고객번호:");
					 name.setNameid(scanner.nextInt());
					 System.out.println("고객이름:");
					 name.setName(scanner.next());
					 people[cnt] = name;
					 cnt++;
					 
					break;
			case 3 : System.out.println("차량조회 입니다.");
			 	 	 for(int j=0; j<count; j++) {
			 	 		 System.out.printf("차량번호: %d%n 차량크기소형(1)|중형(2)|대형(3): %d%n 차량타입세단(1)|SUV(2): %d%n",
			 	 				 cars[j].getId(),cars[j].getSize(),cars[j].getType());
			 	 	 }
			 	 		 break;
			case 4 :
					System.out.println("고객조회");
			        for(int i=0; i<cnt; i++) {
			        	System.out.printf(" 고객번호: %d 고객명: %s%n", 
			        			people[i].getNameid(),people[i].getName());
			        	
			        }
			        break;
			case 5 : 
				     CarSales carSales = new CarSales();
				     NameidSales nameidSales = new NameidSales();
				 	 System.out.println("차량판매 입니다");
				     System.out.println("고객번호를 등록하세요[0:취소]");
				     nameidSales.setNameid(scanner.nextInt());
				     System.out.println("차량번호를 등록하세요[0:취소]");
				     
				break;
			}
		}
	}
}
