package lesson07_0212;

public class SwitchReview {
    public static void main(String[] args) {
        String uncle = "Дядя Саша";
        int floor = 9;
        elevator(floor);
        System.out.println(elevator(9));

    }

    public static String  elevator(int level) {
        String result = "";
        switch (level) {
            case 9:
                result = "9th floor";
                break;
            case 8:
                result = "8th floor";
                break;
            case 7:
                result = "7th floor";
                break;
            case 6:
                result = "6th floor";
                break;
            case 5:
                result = "5th floor";
                break;
            case 4:
                result = "4th floor";
                break;
            case 3:
                result = "3th floor";
                break;
            case 2:
                result = "2th floor";
                break;
            case 1:
                result = "1th floor";
                break;
            case 0:
                result = "Ground floor";
                break;
            case -1:
                result = "Keller";
                break;
            default:
                result = "Error";
                break;
        }
        return "Добрый день! Вы приехали на " + result + "этаж";
    }
}

