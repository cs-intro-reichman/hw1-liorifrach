public class TimeFormat {
    public static void main(String[] args) {
        // המרת שעות ודקות מהקלט
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        
        // קביעת AM/PM והתאמת שעות
        String ampm = "AM";
        
        // אם השעות הן 12 או יותר, אז מדובר ב-PM
        if (hours >= 12) {
            ampm = "PM";
            if (hours > 12) {
                hours -= 12; // המרה לשעון 12 שעות
            }
        }
        
        // טיפול במקרה של חצות (00:00)
        if (hours == 0) {
            hours = 12; // במקרה של 00:00 -> 12:00 AM
        }
        
        // הדפסת התוצאה, עם עיצוב נכון לדקות
        System.out.printf("%d:%02d %s\n", hours, minutes, ampm);
    }
}
