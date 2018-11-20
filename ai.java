import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LabClass3 {
	public static void main (String[] args){
	
	
	
	try {
		//sets file and begins scanner sc
	File f = new File ("student_marks.txt"); 
	Scanner sc = new Scanner(f);
	
	//will loop until there is no lines left in text file
	//purpose is to read and print students name and marks from txt file
	while (sc.hasNextLine()) {
		String a = sc.next(); //sets a as student ID
		String b = sc.next(); //sets b as student first name
		String c = sc.next(); //setbs c as student surname
		int d = sc.nextInt(); //sets d as first test result
		int e = sc.nextInt(); //sets e as second test result
		int g = sc.nextInt(); // sets g as exam results
		
		double h = (76*0.1) + (88*0.1) + (65*0.8); //calculates final mark
		
		System.out.println(b +"		"+ c + "	" + "(" + a + "): " + h ); //prints out name and marks
	}
	
	sc.close(); //closes the scanner
	
	}
	//this will throw the subclass
	 catch (FileNotFoundException e) { 
		System.out.println("an error occured");
	}
	
	}
}

