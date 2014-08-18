import java.util.*;

public class ISLM{
	
	private ArrayList<OutputInterestRatePoint> LM;
	private ArrayList<OutputInterestRatePoint> IS;

	public ISLM(){
		AggregateDemand ad = new AggregateDemand();
		IS = ad.InvestmentSavingCurve();
		LM = LiquidityPreference.LM();
	}

	
}
