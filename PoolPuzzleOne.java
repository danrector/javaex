class PoolPuzzleOne {
	public static void main(String [] args) {
		int x = 0;
		
		while (x < 4) {
			
			if (x < 1) {
			System.out.print("a ");
			System.out.print("noise");
			}
			
			/*if ( ) {
			
			
			}*/
			if (x == 1) {
			System.out.print("annoys");
			}
			if (x > 1) {
			System.out.print("an");
			System.out.print(" oyster");
			x = x + 2;
			}
			System.out.println("");
			x = x + 1;
		}
	}
}