package JavaLP;

public class Employee {
	
	String id;
	String code;
	String name;
	String NIC;
	String address;
	
	public static void main (String [] args) {
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		
		emp1.id="123";
		emp1.code="123";
		emp1.name="John";
		emp1.NIC="JohnNIC";
		emp1.address="JohnAdd";
		
		emp2.id="456";
		emp2.code="456";
		emp3.name="David";
		emp3.NIC="DavisNIC";
		emp3.address="DavidAdd";
		
		emp3.id="123";
		emp3.code="123";
		emp3.name="John";
		emp3.NIC="JohnNIC";
		emp3.address="JohnAdd";
		
		System.out.println("Looking for memory address");
		System.out.println(emp1.id==emp2.id);
		System.out.println(emp2.id==emp3.id);
		System.out.println(emp1.id==emp3.id);
		
		System.out.println(emp1.id==emp2.code);
		System.out.println(emp2.id==emp3.code);
		System.out.println(emp1.id==emp3.code);
		
		System.out.println("Looking for actual value");
		System.out.println(emp1.id.equals(emp2.id));
		System.out.println(emp2.id.equals(emp3.id));
		System.out.println(emp1.id.equals(emp3.id));
		
		System.out.println(emp1.id.equals(emp2.code));
		System.out.println(emp2.id.equals(emp3.code));
		System.out.println(emp1.id.equals(emp3.code));
		
	
		
	}

}
