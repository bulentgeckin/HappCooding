package a.Basic;

public class D01_AllNumbersType {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// this data types is called 'primitive data types' in java
		// 6 different number types and 2 others, we will learn soon

		byte byteX = 100;
		short shortX = 1000;
		int intX = 100000;
		long longX = 10000000000L;
		float floatX = 99.95F;
		double doubleX = 99.9D;
		
		//just for information, we will learn later
		
		System.out.println("Byte       :"+Byte.MIN_VALUE + " to  "+ Byte.MAX_VALUE );
		System.out.println("Short      :"+Short.MIN_VALUE + " to  "+ Short.MAX_VALUE );
		System.out.println("Integer    :"+Integer.MIN_VALUE + " to  "+ Integer.MAX_VALUE );
		System.out.println("Long       :"+Long.MIN_VALUE + " to  "+ Long.MAX_VALUE );
		System.out.println("Float      :"+Float.MIN_VALUE + " to  "+ Float.MAX_VALUE );  // max: 340,282,346,638,528,860,000,000,000,000,000,000,000  :))
		System.out.println("Double     :"+Double.MIN_VALUE + " to  "+ Double.MAX_VALUE );  //its hard to write to screen
		
		

	}

}
