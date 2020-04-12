package a.pack1;

public class Father {

	protected  String fatherName="Albert Einstein";
	private  String ssnFather="123-45-6789";
	
	
	
	public String getSsnFather() {
		return ssnFather.substring(7);
	}
	
	public String getFirstNameOfFather() {
		return fatherName.substring(0,6);
	}
	
	
}
