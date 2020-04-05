
public class TheKingdom 
	{ 
		public static void main (String[] args) 
		{ 
			King kng1 = new King(100, "Arthur", "Iron King"); 
			King kng2 = new King(101, "Lion", "King"); 
			KingdomDirectory engDirectory = new KingdomDirectory(); 
			engDirectory.addEmployee(kng1); 
			engDirectory.addEmployee(kng2); 
			
			Slave slv1 = new Slave(200, "Marcus", "Ordinari slave"); 
			Slave slv2 = new Slave(201, "Spurius ", "Senior slave"); 
			
			KingdomDirectory accDirectory = new KingdomDirectory(); 
			accDirectory.addEmployee(slv1); 
			accDirectory.addEmployee(slv2); 
		
			KingdomDirectory directory = new KingdomDirectory(); 
			directory.addEmployee(engDirectory); 
			directory.addEmployee(accDirectory); 
			directory.showEmployeeDetails(); 
		} 
	} 

	

