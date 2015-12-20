package session6.assignment4;

public class TestClass {

	public static void main(String[] args) {
		Student[] std = {new Student(),new Student()};
		std[0].setName("Aditya");
		std[0].setRegistrationNumber(1000);
		std[0].setRollNumber(1);
		std[1].setName("Ritesh");
		std[1].setRegistrationNumber(1001);
		std[1].setRollNumber(2);
		for(int i=1;i<3;i++)
		{
			System.out.println("Details of Student"+i);
			System.out.println("Name : "+std[i-1].getName());
			System.out.println("Roll Number : "+std[i-1].getRollNumber());
			System.out.println("Registration Number : "+std[i-1].getRegistrationNumber());
		}
	}

}
