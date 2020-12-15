import java.util.Scanner;

public class pandom {
	public static void main(String[] arg) {
		String pand = "";
		
		Scanner input = new Scanner(System.in);
		pand = input.next();
	
		boolean testMe;
		testMe = isItpan(pand);
		System.out.println(testMe);
	}
	
	 public static boolean isItpan(String a) {
		 int wNum = a.length(); 
		 boolean word = true;
		 char [] test =   new char [wNum];
		 char [] test2 = new char [wNum];
		 for(int i = 0; i < wNum && word != false; i++) {
			 test[i] = a.charAt(i);
			 //System.out.println(test[i]); testing 
			 test2[i] = a.charAt((wNum -1) - i);
			 //System.out.print(test2[i]); testing
			 if(test[i] != test2[i])
			 {
				 word = false;
			 }
			
			 
		 }
		 
		 return word;
}
}
