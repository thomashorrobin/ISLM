import java.util.*;

public class AggregateDemand{

	private int tax;
	private int governmentExpenditure;
	private int investmentBase;

	public AggregateDemand(){
		tax = 200;
		governmentExpenditure = 200;
		investmentBase = 400;
	}

	public AggregateDemand(int Tax, int Investment, int GovernmentExpenditure){
		tax = Tax;
		governmentExpenditure = GovernmentExpenditure;
		investmentBase = Investment;
	}

	public int Equlibrium(double InterestRate){
		if(AggregateDemand(1000,InterestRate) < 1000){
			int Y = 999;
			while(AggregateDemand(Y,InterestRate) < Y){
				Y--;
			}
			return Y;
		} else if(AggregateDemand(1000,InterestRate) > 1000){
			int Y = 1001;
			while(AggregateDemand(Y,InterestRate) > Y){
				Y++;
			}
			return Y;
		} else {
			return 1000;
		}
	}

	public ArrayList<OutputInterestRatePoint> InvestmentSavingCurve(){
		ArrayList<OutputInterestRatePoint> list = new ArrayList<OutputInterestRatePoint>();
		for (double i = 0.5; i < 11 ; i += 0.5 ) {
			list.add(new OutputInterestRatePoint(Equlibrium(i),i));
		}
		return list;
	}

	public int AggregateDemand(int Output, double InterestRate){
		return consumption(Output) + investment(Output,InterestRate) + governmentExpenditure;
	}

	private int consumption(int Output){
		return (int)(disposibleIncome(Output) / 4 + disposibleIncome(Output) * 1.05 / 4);
	}

	private int disposibleIncome(int Output){
		return Output - tax;
	}

	private int investment(int Output, double InterestRate){
		return investmentBase + (int)((4.5 - InterestRate) * 50);
	}

	public static void main(String[] args){
		AggregateDemand ad = new AggregateDemand();
		if (args[0].equals("-r")){
			for (int i = 1; i < args.length; i++ ) {
				try {
					int output = Integer.parseInt(args[i]);
					System.out.println(ad.AggregateDemand(output,4.5));
				} catch(Exception e){
					System.out.println("NaN");
				}
			}
		} else if (args[0].equals("-e")){
			double interestRate = Double.parseDouble(args[1]);
			int equlibrium = ad.Equlibrium(interestRate);
			System.out.println(equlibrium);
		} else if (args[0].equals("-i")){
			for(OutputInterestRatePoint p: ad.InvestmentSavingCurve()){
				System.out.println(p.toString());
			}
		}
	}
}