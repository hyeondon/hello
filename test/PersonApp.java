package test;
import java.util.Scanner;

	public class PersonApp{
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Person[] persons = new Person[3];
			
			for(int i=0; i<3; i++) {
				Person person = new Person();
				System.out.println("�̸��� ������?");
				person.name = scanner.next();
				
				System.out.println("���̰� ��� �Ǽ���?");
				person.age = scanner.nextInt();
				
				System.out.println("Ű�� ��� �Ǽ���?");
				person.height = scanner.nextFloat();
				
				persons[i] = person;		
			}
			for(int i=0; i<3; i++) {
				persons[i].printStates();
			}
		}
	}