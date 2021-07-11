package hw4Q3JavaVariablesConstructorAndMethod;

public class SokunthyProfile {
	
			
		public String MyName;
		public int myAge;                  
		public char mySex;
		public boolean usaCitizen;
		public byte myWorkingYear;
		public short myHouseRent;
		public long myYearlySalary;
		public float myGrade;
		public double myHeight;

		
		

		public void print_my_profile() { // method implemented , its a method to call later by constructor
			System.out.println("My name is: " + MyName + ". \nAge: " + myAge + ", sex: " + mySex
					+ ". \nMy citizenship status is " + usaCitizen + ". \nI worked for " + myWorkingYear
					+ "years. \nMy yearly house rent is: " + myHouseRent + ". \nMy yearly salary is: " + myYearlySalary
					+ ". \nMy grade: " + myGrade + " and my height: " + myHeight);
		}
		
		public SokunthyProfile() { // constructor declared ; constructor name as the class name
					}
		
		public static void main(String[] args) {
			SokunthyProfile jasmine =new SokunthyProfile();   //Constructor initializing jasmine is new object
			jasmine.MyName = "Jasmine";
			jasmine.myAge = 40;
			jasmine.mySex = 'M';
			jasmine.usaCitizen = false;
			jasmine.myWorkingYear = 7;
			jasmine.myHouseRent = 24000;
			jasmine.myYearlySalary = 123456789l;
			jasmine.myGrade = 3.822f;
			jasmine.myHeight = 1.7936847628364;		
			jasmine.print_my_profile();
			System.out.println("\n**********************************\n");
			
			SokunthyProfile anwar = new SokunthyProfile(); 
			anwar.MyName = "Anwar";       // "Anwar vai jindabad (vai please don't cut my point :))"
			anwar.myAge = 41;
			anwar.mySex = 'M';
			anwar.usaCitizen = true;
			anwar.myWorkingYear = 8;
			anwar.myHouseRent = 23367;
			anwar.myYearlySalary = 623545654786l;
			anwar.myGrade = 3.672f;
			anwar.myHeight = 1.7636867828364;		
			anwar.print_my_profile();
				
	
	}


	

}
