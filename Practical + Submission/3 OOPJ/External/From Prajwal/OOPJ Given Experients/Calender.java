public class Calender {
    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        if (checkdate(day, month, year)) {
            findday(day, month, year);
        } else {
            System.out.println("Please Enter A correct date");
        }
    }

    public static boolean checkdate(int day, int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day <= 31 && day >= 1) {
                return true;
            } else {
                return false;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day <= 30 && day >= 1) {
                return true;
            } else {
                return false;
            }
        } else if (month == 2 && isleapyear(year)) {
            if (day <= 29 && day >= 1) {
                return true;
            } else {
                return false;
            }
        } else if (month == 2 && !(isleapyear(year))) {
            if (day <= 28 && day >= 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public static boolean isleapyear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void findday(int day, int month, int year) {
        // zellers formula to calculate day
        // w = (d + (13(m+1)/5) +y + (y/4)+ (c/4)+ 5c)%7
        // y = Last two digits of the year
        // c = first two digits of year
        // w = 0 then saturday and w = 6 then friday
        String weekday[] = { "saturday", "Sunday", "monday", "Tuesday", "Wednesday", "Thursday", "friday" };
        if (month == 1 || month == 2) {
            month = month + 12;
            year--;
        }
        int y = year % 100;
        int c = year / 100;
        int w = day + (13 * (month + 1) / 5) + y + (y / 4) + (c / 4) + (5 * c);
        w = w % 7;
        System.out.println("The day for the given date is :" + weekday[w]);

    }
}