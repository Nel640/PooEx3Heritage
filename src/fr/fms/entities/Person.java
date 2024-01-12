package fr.fms.entities;
import java.util.ArrayList;

public class Person 
{
	String firstName;
	String lastName;
	int age;
	String adress;
	City location;
	
	final int Unknow_AGE = 0;
	
	public Person ( String fisrtName , String lastName , int age , String adress , City location )
	{
		this.firstName = fisrtName;
		this.lastName = lastName;
		this.age = age;
		this.adress = adress;
		this.location = (City) location;
	}
	
	public Person ( String firstName , String lastName , int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.adress = "unknow";
	}
	
	public Person ( String firstName , String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = Unknow_AGE;
		this.adress = "unknow";
	}

	
	public String toString()
	{
		return "LastName : " + lastName +
			   " , FirstName : "+ firstName +
			   " , age : " + age +
			   " , adress : " + adress +
			   this.location;
	}
	//........................................................................
	
	public static ArrayList<Person> personalitys = new ArrayList<Person>();
	
	public static void addPerson ( Person person)
	{
		personalitys.add(person);
	}
	
	public static void displaySortCityandBorncity()
	{
		//System.out.println(personalitys);
		for(int i = 0 ; i < personalitys.size() ; i++)
		{
				Person personn = personalitys.get(i);
				String sysPerson = personn.firstName + " , " + personn.lastName + " , " +
						   personn.age + " , " + personn.adress + " , ville de naissance : " +
						   personn.location.city + " , " + personn.location.country + " , " +
						   personn.location.numberPoeple + " d'habitants";
				
				System.out.println(sysPerson);
				System.out.println(personn);
				
		}
	}
}

