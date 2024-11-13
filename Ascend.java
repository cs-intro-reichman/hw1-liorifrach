// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int num1 = (int)(Math.random()*lim + 1);
		int num2 = (int)(Math.random()*lim + 1); 
		int num3 = (int)(Math.random()*lim + 1); 
		
		int min = 0;
		int middle = 0;
		int max = 0; 
		
		// num1=min
		if(num1 <= num2 && num1<= num3){
			min = num1;
			if(num2 <= num3){
				middle = num2;
				max = num3;
			}
			else{
				middle = num3;
				max = num2;
			}
		}
		// num2=min
		if(num2 <= num1 && num2 <= num3){
			min = num2;
			if(num1 <= num3)
			{
				middle = num1;
				max = num3;
			}
			else{
				middle = num3;
				max = num1;
			}

		}
		// num3=min
		if(num3 <= num1 && num3 <= num2){
			min = num3;
			if(num1 <= num2)
			{
				middle = num1;
				max = num2;
			}
			else{
				middle = num2;
				max = num1;
			}

		}


		System.out.println(num1 +" "+ num2 +" "+ num1);
		System.out.println(min +" "+ middle +" "+ max);
	}
}
