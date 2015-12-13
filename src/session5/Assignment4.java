package session5;
class Bank{
	double rate_of_interest;
	double getRateOfInterest()
	{   rate_of_interest = 5.0;//default
		return rate_of_interest;
	}
}
class SBI extends Bank{
	double getRateOfInterest()
	{   rate_of_interest = 8.0;//default
		return rate_of_interest;
	}
}
class ICICI extends Bank{
	double getRateOfInterest()
	{   rate_of_interest = 7.0;//default
		return rate_of_interest;
	}
}
class AXIS extends Bank{
	double getRateOfInterest()
	{   rate_of_interest = 9.0;//default
		return rate_of_interest;
	}
}
public class Assignment4 {
	public static void main(String[] args) {
		Bank sbi = new SBI();
		Bank icici = new ICICI();
		Bank axis = new AXIS();
		System.out.println("Rate of interest in SBI Bank is : "+sbi.getRateOfInterest());
		System.out.println("Rate of interest in ICICI Bank is :"+icici.getRateOfInterest());
		System.out.println("Rate of interest in AXIS Bank is :"+axis.getRateOfInterest());
	}

}
