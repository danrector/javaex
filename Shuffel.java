class Shuffel {
	
	public static void main (String [] args) {
		
		//Define X
		int x = 3;
		
		//Initialize Loop
		while (x > 0) {
			
			if (x == 2) {
				System.out.print("b c");
			}
			
			if (x == 1) {
				System.out.print("d");
				x = x - 1;
			}
			
			if (x > 2) {
				System.out.print("a");
			}
			
			//Edit variable at end of loop
			x = x - 1;
			
			System.out.print("-");
		}
	}
}