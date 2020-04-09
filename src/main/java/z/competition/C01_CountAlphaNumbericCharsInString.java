package z.competition;

public class C01_CountAlphaNumbericCharsInString {

	public static void main(String[] args) {

		String given = "&(*&#@(*423847239H42389ell84320o428W*)(#*or*)(ld&^&^*^*^" ;
		String replaced=given.replaceAll("[^A-Za-z]","");
		
		System.out.println(given);
		System.out.println(replaced);
		
		
		
	}

}
