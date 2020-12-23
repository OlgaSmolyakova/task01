package by.htp.les04.main;

public class Main {

	public static void main(String[] args) {
		// break
		// continue;
		
		
		int x = 1;
		while(x < 10) {
			System.out.println("x = " + x);
			
			if(x == 5) {
				
				continue;
			}
			
			x++;
		}
		System.out.println("after");

	}

}
