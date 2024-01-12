package fr.fms.entities;

public class City {
		
	public String city;
	public String country;
	public int numberPoeple;
	
	private static int COUNTER = 0;
	
	public City ( String city , String country , int numberPoeple)
	{
		this.city = city;
		this.country = country;
		this.numberPoeple = numberPoeple;
	}
	
	public int setCounter(int count) {
		if ( count >= 0 )
		{
			count = 1;
		}
		return count;
	}
	
	public int getNbpoeple()
	{
		return numberPoeple;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public int setNbpoeple(int addpoeple)
	{
		return this.numberPoeple = getNbpoeple() + addpoeple;
	}
	
	public void setObjectCity ( Object city)
	{
		System.out.println("nouvelles valeurs : \n" + city);
	}
	
	public void setaddpoeple(int nbpoeple , Object city)
	{
		int numpoeple = getNbpoeple() + nbpoeple;
		if (numpoeple < getNbpoeple() )
		{
			System.out.println("action impossible , on ne peut retirer d'habitants ");
			System.out.println("resultat test si nombre saisi <= a zero.......");
		}
		else
		{
			setNbpoeple(nbpoeple);
			System.out.println("ajout de :" + nbpoeple + " personnes a " +  getCity() + "\n");
			setObjectCity(city);
		}
	}
//exo 1.3
//	public String toString()
//	{
//		return  "city : " + this.city + "\n" +
//				"country : " + this.country + "\n" +
//				"nombre d'habitant : " + this.numberPoeple;
//	}
//	public String toString()
//	{
//		return "Syso : ville de " + this.city + " a un nombre de " + this.numberPoeple + " habitants";
//	}
	
	public String toString()
	{
		return " city = "+this.city + " , country = "+this.country + " , nbResident = "+this.numberPoeple;
	}
	
	public static void displayCounter()
	{
		System.out.println("nombre d'instance de testcity : " + COUNTER);
	}
}

