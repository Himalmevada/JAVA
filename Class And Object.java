class details{
	 
	String Name;
	int Year;
	String Addr;
	
	public details(String Name ,int Year ,String Addr)
	{
		this.Name = Name;
		this.Year = Year;
		this.Addr = Addr;
		System.out.println(Name + "	" + Year + "	      " + Addr);
	}
}

public class ClassAndObject {

	public static void main(String[] args) {
		System.out.println("Name	   Year of joining	    Address");
		details d1 = new details("Robert-1",1994,"64C - WallStreet-1");
		details d2 = new details("Robert-2",1995,"64C - WallStreet-2");
		details d3 = new details("Robert-3",1996,"64C - WallStreet-3");
		
	}

}
