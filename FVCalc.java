// Computes the future value of a saving investment.
public class FVCalc {
	public FVCalc() {
	}
		public static void main(String[] var0){

			int dollars = Integer.parseInt(var0[0]);
			double rate = Double.parseDouble(var0[1]);
			int years = Integer.parseInt(var0[2]);
			double newrate = rate / 100.0;
			
			double futureValue = dollars * ( Math.pow(1 + newrate, years));

			int reundedFutureValue = (int) Math.round(futureValue);
			
			System.out.println("After " + years + " years, $" + dollars + " saved at " + rate + "% will yield $" + reundedFutureValue);
		
	}
	

	
}