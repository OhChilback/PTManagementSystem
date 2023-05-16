package ptMember;

import java.util.Scanner;

public class DietPtMember extends PtMember {
	
	public DietPtMember(PtMemberType type) {
		super(type);
	}
	
	public void getUserScan(Scanner scan) {
		
			setPtMemberID(scan);
			setPtMemberName(scan);
			setPtMemberHeight(scan);
			setPtMemberWeight(scan);
			setPtMemberAge(scan);
			setPtMemberBirthday(scan);
			setPtMemberGender(scan);
			setPtMemberPhoneNumber(scan);
			setPtMemberAddress(scan);
	}
	
	public void viewPrint(){
		String stype = getTypeString(); 
		System.out.println();
		System.out.println("type:" + stype + " name:"+name+" id:"+id+" height:"+height+" weight:"+weight);
		System.out.println("age:"+age+" birthday:"+birthday+" gender:"+gender+" phoneNumber:"+phoneNumber+" address:"+address);
		System.out.println();
	}

	
}