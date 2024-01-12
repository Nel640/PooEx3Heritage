package fr.fms.entities;

public class TestCapital 
{
	public static void main(String[] args) 
	{
		Capital paris = new Capital("Paris", "France" , 2000000, "Tour eiffel");
		Capital london = new Capital("Londres", "GB", 940000 , "Bigben");
		Capital usa = new Capital("washington", "usa" , 7600000 , "W-M");
		Capital afrique = new Capital("Addis-Abeba", "afrique" , 1500000, "pyramides");
		
		System.out.println(paris);
		System.out.println(london);
		System.out.println("..................................................................................");
		
		Employee gate = new Employee("Bill", "Gate" , 64 , "habite aux usa", usa);
		Employee musk = new Employee("Elon", "Musk" , 49 , "habitant a palo aloto", afrique);
		
		Employee.addPerson(musk);
		Employee.addPerson(gate);
		
		Employee.displaySortCityandBorncity();
	}
	
}
