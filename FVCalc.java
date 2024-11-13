// Computes the future value of a saving investment.
public class FVCalc {
	public FVCalc() {
	}
		public static void main(String[] var0){

			int var1 = Integer.parseInt(var0[0]);
			int var2 = Integer.parseInt(var0[0]);
			int var3 = Integer.parseInt(var0[0]);
			int finelamount=var1; 
			// calculatint the future amount by incrising var1 every year
			for(int i=0; i<=var3; i++)
			{
				finelamount=finelamount + (finelamount*(var3/100));
			}
			System.out.println("after" + var2 + "years," + var1+"$, saves at"+var3+"% will yeild "+finelamount+"$");

		// Replace this comment with your code
		
	
		int yield = 0; 
	}
	

	
}