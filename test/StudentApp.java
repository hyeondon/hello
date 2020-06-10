package test;
import java.util.Scanner;

	public class StudentApp{
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Student[] students = new Student[1];
			
			for(int i=0; i<students.length; i++) {
				Student student = new Student();
				System.out.println("이름을 입력하세요: ");
				student.setName(scanner.next());
				
				System.out.println("국어점수: ");
				student.setKor(scanner.nextInt());
					
				System.out.println("영어점수: ");
				student.setEng(scanner.nextInt());
				
				System.out.println("수학점수: ");
				student.setMath(scanner.nextInt());

				student.sum();
				
				student.avg(); 
				
				
				students[i] = student;
			}
			
				for(int i=0; i<students.length; i++) {
					students[i].printStates();
				}
		}
	}