package hw4Q3JavaVariablesConstructorAndMethod;

public class MyProfile {
	
	public String MyName;
	public int myAge;                  // variable declared
	public char mySex;
	public boolean usaCitizen;
	public byte myWorkingYear;
	public short myHouseRent;
	public long myYearlySalary;
	public float myGrade;
	public double myHeight;

	
	public MyProfile() { // constructor declared ; constructor name as the class name
		System.out.println();
	}

	public void my_profile() { // method implemented , its a method to call later by constructor
		System.out.println("My name is: " + MyName + ". \nAge: " + myAge + ", sex: " + mySex
				+ ". \nMy citizenship status is " + usaCitizen + ". \nI worked for " + myWorkingYear
				+ "years. \nMy yearly house rent is: " + myHouseRent + ". \nMy yearly salary is: " + myYearlySalary
				+ ". \nMy grade: " + myGrade + " and my height: " + myHeight);
	}
	
//	public static void main(String[] args) {
//		MyProfile pavel = new MyProfile();   //Constructor initializing
//		pavel.MyName = "Pavel";
//		pavel.myAge = 40;
//		pavel.mySex = 'M';
//		pavel.usaCitizen = false;
//		pavel.myWorkingYear = 7;
//		pavel.myHouseRent = 24000;
//		pavel.myYearlySalary = 123456789l;
//		pavel.myGrade = 3.822f;
//		pavel.myHeight = 1.7936847628364;		
//		pavel.my_profile();
//		System.out.println("\n**********************************\n");
//		
//		MyProfile anwar = new MyProfile(); 
//		anwar.MyName = "Anwar";       // "Anwar vai jindabad (vai please don't cut my point :))"
//		anwar.myAge = 41;
//		anwar.mySex = 'M';
//		anwar.usaCitizen = true;
//		anwar.myWorkingYear = 8;
//		anwar.myHouseRent = 23367;
//		anwar.myYearlySalary = 623545654786l;
//		anwar.myGrade = 3.672f;
//		anwar.myHeight = 1.7636867828364;		
//		anwar.my_profile();
//			
//
//}


}
