public class MinutesIntoYears {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//double MinutesInYear = 60*24*365;
		
		System.out.println("Enter Minutes : ");
		double minute = sc.nextDouble();
		
		int year = (int) (minute / 60/24/365);
		int day = (int) (minute /60/24) % 365;
		
		
		System.out.println("Minute :"+ minute +"  Year : " + year + "  Day : " + day);

	}

}
