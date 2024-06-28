package MavenSecondPack;

public class Encapsulation1 {

	private int rollNo;
	private String name;
	
	public void setDetails(int r, String n) {
		rollNo=r;
		name=n;
	}
	public void getDetails() {
		System.out.println("Roll Number: " + rollNo);
		System.out.println("Name: " + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
