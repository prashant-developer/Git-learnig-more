package ROOT;
import org.openqa.selenium.WebDriver;

import ROOT.ClassTwo;

public class ClassOne {

	//ClassTwo CTwo = new ClassTwo();
	WebDriver driver;
	//static String browser = ClassTwo.browser ;
		
	public static void main(String[] args) {
		
		System.out.println("Log Check in main class");
	}

	static void ClassOneFunction(String fname) {
		System.out.println("ClassOneFunction Called by " + fname);
	}
	
}
