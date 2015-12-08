package session2;

public class Assignment4 {

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		switch(month){
		case 1:
			System.out.println("Number of days in January is : "+31);
			break;
		case 2:
			System.out.println("Number of days in  February is : "+28 +" OR " + 29);
			break;
		case 3:
			System.out.println("Number of days in  March is : "+31);
			break;
		case 4:
			System.out.println("Number of days in  April is : "+30);
			break;
		case 5:
			System.out.println("Number of days in  May is : "+31);
			break;
		case 6:
			System.out.println("Number of days in  June is : "+30);
			break;
		case 7:
			System.out.println("Number of days in  July is : "+31);
			break;
		case 8:
			System.out.println("Number of days in  August is : "+31);
			break;
		case 9:
			System.out.println("Number of days in  September is : "+30);
			break;
		case 10:
			System.out.println("Number of days in  October is : "+31);
			break;
		case 11:
			System.out.println("Number of days in  November is : "+30);
			break;
		case 12:
			System.out.println("Number of days in  December is : "+31);
			break;
		default:
			System.out.println("Invalid month");
			break;
				
			
		}
	}

}
