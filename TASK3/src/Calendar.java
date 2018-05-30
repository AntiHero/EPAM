
/*
 *This class provides methods for calculating next date after user's one.
 *If the user inserts wrong values for day, month or year they 
 *converted to their default values (day = 1, month = 1, year = 2000)
 */
public class Calendar {
    public static String calcNextDate(int day, int month, int year) {
        final int JANUARY = 1;
        final int FEBRUARY = 2;
        final int MARCH = 3;
        //final int APRIL = 4;
        final int MAY = 5;
        //final int JUNE = 6;
        final int JULY = 7;
        final int AUGUST = 8;
        //final int SEPTEMBER = 9;
        final int OCTOBER = 10;
        //final int NOVMEBER = 11;
        final int DECEMBER = 12;

        final int DAYS_IN_FEB_AT_LEAP_YEAR = 29;
        final int DAYS_IN_FEB = 28;

        final int DAYS_IN_A_MONTH_31 = 31;
        final int DAYS_IN_A_MONTH_30 = 30;

        String result = "";

        year = isYear(year);
        month = isMonth(month);
        day = isDay(day, month);
        
        int next_year = year;
        int next_day = day;
        int next_month = month;

        if (month == JANUARY || month == MARCH || month == MAY || month == JULY || month == AUGUST
                || month == OCTOBER) {
            if (day == DAYS_IN_A_MONTH_31) {
                
                next_day = 1;
                next_month = month + 1;
                
            } 
            else {
                
                next_day = day + 1;
                
            }
        }
        else if (month == FEBRUARY) {
            
            if (isLeapYear(year)) {
                
                if (day == DAYS_IN_FEB_AT_LEAP_YEAR) {
                    
                    next_day = 1;
                    next_month = month + 1;
                    
                } 
                else if (day <= DAYS_IN_FEB_AT_LEAP_YEAR) {
                    
                    next_day = day + 1;
                    
                } 
                else {
                    
                    day = 1;
                    next_day = day + 1;

                    result = "<Incorrect day number!> ";
                    
                }
            } 
            else if (day == DAYS_IN_FEB) {
                
                next_day = 1;
                next_month = month + 1;
                
            }
            else if (day <= DAYS_IN_FEB) {
                
                next_day = day + 1;
                
            } 
            else {
                
                day = 1;
                next_day = day + 1;

                result = "<Incorrect day number!> ";
                
            }
        } 
        else if (month == DECEMBER) {
            
            if (day == DAYS_IN_A_MONTH_31) {
                
                next_day = 1;
                next_month = 1;
                next_year = year + 1;

                result = "!!!HAPPY NEW YEAR!!! ";
                
            } 
            else {
                
                next_day = day + 1;
                
            }
        } 
        else if (day == DAYS_IN_A_MONTH_30) {
            
                next_day = 1;
                next_month = month + 1;
                
             } 
        else {
            
            next_day = day + 1;
            
        }
        
        return  result + "Your date is: " + day + "." + month + "." + year + " next date is: "
                    + next_day + "."  + next_month + "." + next_year;
                
    }

    public static int isYear(int year) {
        
        // default value for year
        int result = 2000;

        if (year > 0) {
            result = year;
        }
        return result;
    }

    public static int isMonth(int month) {

        // default value for month
        int result = 1;

        if (month >= 1 && month <= 12) {
            result = month;
        }

        return result;
    }

    public static int isDay(int day, int month) {

        // default value for day
        int result = 1;

        if (day >= 1 && day <= 31) {
            result = day;
        }

        return result;
    }

    public static boolean isLeapYear(int year) {
        boolean result = false;

        if (year % 400 == 0 || year % 4 == 0) {
            result = true;
        }
        return result;
    }
}