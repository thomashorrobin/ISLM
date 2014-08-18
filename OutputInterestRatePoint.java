

public class OutputInterestRatePoint{

	private int output;
	private double interestRate;

	public OutputInterestRatePoint(int Output, double InterestRate){
		output = Output;
		interestRate = InterestRate;
	}

	@Override
	public String toString(){
		return Double.toString(interestRate) + " - " + Integer.toString(output);
	}

	public double InterestRate() { return interestRate; }
	public int Output() { return output; }

}
