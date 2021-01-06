package lesson06_0112;

public class YourSwitchCalendar {
    public static void main(String[] args) {
        String month = "May";
        String month1 = "JANUARY";
        System.out.println(stringToIntMonthNumber(month1));
    }

    public static int stringToIntMonthNumber(String month) {
        month = month.toLowerCase();
        System.out.println("Проверка написания - " + month);
        int monthNumber = 0;
        switch (month) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default:
                monthNumber = -1;
                break;
        }
        return monthNumber;
    }
}
