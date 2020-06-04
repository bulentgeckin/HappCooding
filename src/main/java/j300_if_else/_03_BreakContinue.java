package j300_if_else;

public class _03_BreakContinue {
	
	
	public static void main(String args[]) {
		
		
		
		// it will stop when arrive 4   | 0.1.2.3 |
		for (int i = 0; i < 7; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.print(i+" ");
			}
		
		System.out.println();
		
		
		// it will pass when arrive 4 | 0.1.2.3.5.6 |
		for (int i = 0; i < 7; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.print(i+" ");
			}
		
		
	}

}
