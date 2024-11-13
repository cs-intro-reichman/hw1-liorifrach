// Computes the future value of a saving investment.
public class FVCalc {
	public FVCalc() {
	}
		public static void main(String[] var0){

			int currect = Integer.parseInt(var0[0]);

			double rate = Double.parseDouble(var0[1]);
			int length = Integer.parseInt(var0[2]);
		
			double future = 0;
			
			future = currect * Math.pow(1 + rate / 100 , length);
			
			System.out.println("After " + length + " years, $" + currect + " saved at " + rate + "% will yield $" + (int)future);
		
	}
	

	
}