package youtubeEgitim;

public class StudentCreditManager extends BaseCreditManager{
	
	@Override
	public double calculate(double amount) {
		
		double credit = amount * 1.18;
		
		return credit - (credit * 0.5);
	}

}
