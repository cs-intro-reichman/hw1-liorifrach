public class TimeFormat {
    public static void main(String[] args) {

        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        String ampm = "AM";

     
        if (hours >= 12) {
            ampm = "PM";
            if (hours > 12) {
                hours -= 12; 
            }
        }


        if (hours == 0) {
            hours = 12; 
            ampm = "AM"; 
        }

   
        System.out.printf("%d:%02d %s\n", hours, minutes, ampm);
    }
}
