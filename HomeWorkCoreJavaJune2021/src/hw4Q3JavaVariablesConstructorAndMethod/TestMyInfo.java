package hw4Q3JavaVariablesConstructorAndMethod;

public class TestMyInfo {
	
	
	public static void main(String[] args) {
		MyProfile pavel = new MyProfile(); 
		pavel.MyName = "Tofael";
		pavel.myAge = 40;
		pavel.mySex = 'M';
		pavel.usaCitizen = true;
		pavel.myWorkingYear = 7;
		pavel.myHouseRent = 24000;
		pavel.myYearlySalary = 123456789l;
		pavel.myGrade = 3.122f;
		pavel.myHeight = 1.7636847628364;		
		pavel.my_profile();
		System.out.println("*******************************************************************************");
		
		MyProfile anwar = new MyProfile(); 
		anwar.MyName = "Anwar";
		anwar.myAge = 41;
		anwar.mySex = 'M';
		anwar.usaCitizen = true;
		anwar.myWorkingYear = 8;
		anwar.myHouseRent = 23367;
		anwar.myYearlySalary = 623545654786l;
		anwar.myGrade = 3.672f;
		anwar.myHeight = 1.7636867828364;		
		anwar.my_profile();
		System.out.println("*******************************************************************************");
		

}
}