
public class fibThing {
	public static void main(String[] arg) {
		 int num = 1;
		 int newnum = 0;
		 int newnum2 = 0;
		 for(int i = 0; i<= 10; i++) {
			 System.out.println(newnum2);
			 newnum2 = num + newnum;
			 newnum = num;
			
			num = newnum2;
			
			
			 
		 }
	}
}
