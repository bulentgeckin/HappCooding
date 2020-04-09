package z.competition;

import java.util.ArrayList;

public class G01_FibonacciNumbers {

	
	// print fibonacci first x numbers
	
	public static void main(String[] args) {
		
		int max=30;
		
		ArrayList<Integer> fibs=new ArrayList<>();
		
		fibs.add(1);
		fibs.add(1);
		
		for (int i=2;i<max;i++) {
			fibs.add(i,fibs.get(i-2)+fibs.get(i-1));
		}
		
		System.out.println(fibs);
		
		
		
	}

}
