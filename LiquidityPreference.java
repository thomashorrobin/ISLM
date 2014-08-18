import java.util.*;

public class LiquidityPreference{
	
	private int Mt(int Output){
		return (int)(Output / 5);
	}

	private int Ms(int Output, double InterestRate){
		return (int)(Output / 5 - Output * InterestRate / 450);
	}

	private int M(int Output, double InterestRate){ return Mt(Output) + Ms(Output,InterestRate); }

	public LiquidityPreference(int Output){

	}

	public static ArrayList<OutputInterestRatePoint> LM(){
		ArrayList<OutputInterestRatePoint>  list = new ArrayList<OutputInterestRatePoint> ();
		for (double i = 0; i <11; i += 0.25){
			list.add(new OutputInterestRatePoint((int)(i * 144),i));
		}
		return list;
	}
}