package session5;

class BasicBuilding{
	int no_of_storey;
	int no_of_flats_per_floor;
	boolean isLift;
	BasicBuilding(int a,int b,boolean lift)
	{
	    no_of_storey = a;
		no_of_flats_per_floor = b;
		isLift = lift;
	
	}
	int total_no_flats()
	{
		return no_of_flats_per_floor * no_of_storey;
	}
	double height_of_building()
	{
		return 2*no_of_storey;
	}
}

class SocietyBuilding extends BasicBuilding{
	int num_block;
	SocietyBuilding(int a,int b,boolean lift,int block)
	{
		super(a,b,lift);
		num_block = block;
	}
	int total_no_flats()
	{
		return num_block*super.total_no_flats();
	}
}
class PrivateBuilding extends BasicBuilding{
	double park_length;
	double park_width;
	PrivateBuilding(int a,int b,boolean lift,double parkl , double parkw)
	{
		super(a,b,lift);
		park_length = parkl;
		park_width = parkw;
	}
	double areaOfPark()
	{
		return park_length*park_width;
	}
	
}	

public class Assignment2 {
	public static void main(String[] args) {
		
		PrivateBuilding pri = new PrivateBuilding(4,4,false,20,30);
		SocietyBuilding soc = new SocietyBuilding(4,8,true,3);
		System.out.println("For Private Building : ");
		System.out.println("Total number of flats : "+pri.total_no_flats());
		System.out.println("Lift Availability : "+pri.isLift);
		System.out.println("Park Area : "+pri.areaOfPark()+" sq. meter");
		System.out.println("Height of building : "+pri.height_of_building() + "meter");
		System.out.println("=========================");
		System.out.println("For Society Building : ");
		System.out.println("Total number of flats : "+soc.total_no_flats());
		System.out.println("Lift Availability : "+soc.isLift);
		System.out.println("Height of building : "+pri.height_of_building() + "meter");
		
	}

}
