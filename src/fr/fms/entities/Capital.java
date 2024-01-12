package fr.fms.entities;

public class Capital extends City 
{
	private String monument;

	public Capital( String city , String country , int numberPoeple , String monument ) {
		super(city, country, numberPoeple);
		this.monument = monument;
	}
	
	public String toString()
	{
		return city + " , "+country + " , " + numberPoeple + " d'habitants monument : " + this.monument;
	}
}
