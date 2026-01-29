package Basic;

public class DemoIfElse {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java DemoIfElse <year> <month>");
            System.err.println("Example: java DemoIfElse 2024 2");
            return;
        }
        try {
            int year = Integer.parseInt(args[0]);
            int month = Integer.parseInt(args[1]);
            boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
            String monthName;
            int days;
            switch (month) {
                case 1:  monthName = "January";    days = 31; break;
                case 2:  monthName = "February";   days = isLeapYear ? 29 : 28; break;
                case 3:  monthName = "March";      days = 31; break;
                case 4:  monthName = "April";      days = 30; break;
                case 5:  monthName = "May";        days = 31; break;
                case 6:  monthName = "June";       days = 30; break;
                case 7:  monthName = "July";       days = 31; break;
                case 8:  monthName = "August";     days = 31; break;
                case 9:  monthName = "September";  days = 30; break;
                case 10: monthName = "October";    days = 31; break;
                case 11: monthName = "November";   days = 30; break;
                case 12: monthName = "December";   days = 31; break;
                default:
                    System.out.println("Invalid month: " + month + ". Please enter 1-12.");
                    return;
            }

            System.out.println("Year " + year + ", " + monthName + " has " + days + " days.");

        } catch (NumberFormatException e) {
            System.err.println("Error: Please enter valid integers for year and month.");
        }
    }
}