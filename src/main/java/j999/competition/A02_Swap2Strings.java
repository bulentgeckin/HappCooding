package j999.competition;

public class A02_Swap2Strings {

	public static void main(String[] args) {
		
		String str1="aa",str2="bbbbb";
		
		str1=str1+str2;  //HelloWorld
		str2=str1.substring(0,str1.length()-str2.length()); //Hello
		str1=str1.substring(str2.length());//World
		
		System.out.println(str1);
		System.out.println(str2);
		
		
	}

}
