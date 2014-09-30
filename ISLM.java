import java.util.*;

public class ISLM{
	
	private ArrayList<OutputInterestRatePoint> LM;
	private ArrayList<OutputInterestRatePoint> IS;

	public ISLM(){
		AggregateDemand ad = new AggregateDemand();
		IS = ad.InvestmentSavingCurve();
		LM = LiquidityPreference.LM();
	}
	
	public String PrintISLM(){
	  String s = "IS curve\n";
	  for(OutputInterestRatePoint orp: IS){
	      s += orp.toString() + "\n";
	   }
	  s = "LM curve\n";
	  for(OutputInterestRatePoint orp: LM){
	      s += orp.toString() + "\n";
	   }
	   return s;
	}
}
