// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
	
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // Replace this comment with the rest of your code
		String period = "AM";
		if (hours >= 12){
			period = "PM";
			if(hours > 12){
				hours -= 12; // from 24 to 12 hours

			}
		} else if(hours == 0){
			hours = 12; // midnight
		}
		if (minutes < 10) {
			System.out.println((hours + ":0" + minutes + " " + period));

		}
		else{
			System.out.println(hours + ":" + minutes + " " + period);
		}

		}
	}
