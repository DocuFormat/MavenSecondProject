package MavenSecondPack;

public class AggregationEmployee {

	AggregationAddress address;
	
	int empid;
	String name;
	
	public AggregationEmployee(int empid, String name, AggregationAddress adr) {
		address=adr;
		this.empid=empid;
		this.name=name;
	}
	public void display() {
		System.out.println(empid);
		System.out.println(name);
		System.out.println(address.city);
		System.out.println(address.state);
		System.out.println(address.country);
	}
	public static void main(String[] args) {

		AggregationAddress adr = new AggregationAddress("Tvpm", "Kerala", "India");
		
		AggregationEmployee adrnew = new AggregationEmployee(101, "nidhin", adr);
		adrnew.display();
		
		AggregationAddress adr1 = new AggregationAddress("Kollam", "Kerala", "India");
		
		AggregationEmployee adrnew1 = new AggregationEmployee(102, "John", adr1);
		adrnew1.display();
	}

}
