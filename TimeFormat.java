// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
	
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String period = "AM";

		if (hours >= 12){
			period = "PM";
			if(hours > 12){
				hours = hours - 12; // from 24 to 12 hours

			}
		}
		
			System.out.println(hours + ":");
			System.out.printf("%02d", minutes);
			System.out.println(" " + period);
		

		}
	}
