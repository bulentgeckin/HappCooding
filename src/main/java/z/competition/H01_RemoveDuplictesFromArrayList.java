package z.competition;

import java.util.ArrayList;
import java.util.HashSet;

public class H01_RemoveDuplictesFromArrayList {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<>();
		
		list.add("Toyota");
		list.add("Mercedes");
		list.add("Tesla");
		list.add("Toyota");
		list.add("Mercedes");
		list.add("Tesla");
		list.add("Toyota");
		list.add("Mercedes");
		list.add("Tesla");
		list.add("Tesla");
		list.add("Tesla");
		
		
		HashSet<String> uniqList=new HashSet<>(list);
		
		System.out.printf("Item # %-5s  Raw List   : %s%n",list.size(),list);
		System.out.printf("Item # %-5s  Uniq List  : %s%n",uniqList.size(),uniqList);
		
		
	}

}
