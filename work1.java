import java.util.Scanner;


public class work1 {
	public static void main(String[] arg) {
		String pand = "";
		
		Scanner input = new Scanner(System.in);
		pand = input.next();
		
	}
	




 public void Odds(){
	for(int i = 0; i <= 50;) {
		if(i%2 != 0) {
			System.out.print(i);
		}
		i++;
	}
 }
 
 public void fibby() {
	 int num = 1;
	 int newnum = 0;
	 int newnum2 = 0;
	 for(int i = 0; i<= 10;) {
		 
		 newnum += num;
		newnum2 = num + newnum;
		System.out.println(newnum2);
		
		 
	 }
			 
 }
 
 public boolean isItpan(String a) {
	 int wNum = a.length(); 
	 boolean word = true;
	 char [] test =   new char [wNum];
	 char [] test2 = new char [wNum];
	 for(int i = 0; i <= wNum && word != false; ) {
		 test[i] = a.charAt(i);
		 test2[i] = a.charAt(wNum - i);
		 if(test[i] != test2[i])
		 {
			 word = false;
		 }
		 i++;
		 
	 }
	 
	 return word;
 }
}