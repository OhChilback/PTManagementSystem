package ptMember;

import java.util.Scanner;

public class BulkUpPtMember extends PtMember {
	
	//type만 생성자 추가
			public BulkUpPtMember(PtMemberType type) {
				super(type);
			}
	
	public void getUserScan(Scanner scan) {
		System.out.print("ID :");
		int id = scan.nextInt();
		this.setId(id);
		
		scan.nextLine();//넘어가기 방지
		
		System.out.print("Name: ");
		String name = scan.nextLine();
		this.setName(name);
		
		System.out.print("Height: ");
		double height = scan.nextDouble();
		this.setHeight(height);
		
		System.out.print("Weight: ");
		double weight = scan.nextDouble();
		this.setWeight(weight);
		
		//칼로리 받는 while문 추가
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you want to show Bulkup recommand calories? (Y/N)");
			answer = scan.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				double calories = this.getWeight()* 40;
				this.setCalories(calories);
				
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setCalories(0);
				break;
			}
			else {
				
			}
		}
		
		System.out.print("Age: ");
		int age = scan.nextInt();
		this.setAge(age);
		
		System.out.print("Birthday: ");
		int birthday= scan.nextInt();
		this.setBirthday(birthday);
		
		scan.nextLine();//넘어가기 방지
		
		System.out.print("Gender: ");
		String gender = scan.nextLine();
		this.setGender(gender);
		
		System.out.print("Phone Number: ");
		int phoneNumber = scan.nextInt();
		this.setPhoneNumber(phoneNumber);
		
		scan.nextLine();//넘어가기 방지
		
		System.out.print("address: ");
		String address = scan.nextLine();
		this.setAddress(address);
	}

}