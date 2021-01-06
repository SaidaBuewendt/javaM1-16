package lesson07_0212;

public class HWanalysSwitch {
    public static void main(String[] args) {
        int month = 12;
        System.out.println(findSeason(5  ));
    }

    private static String findSeason(int monthNumber) {
        String season = "";
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 11:
            case 10:
            case 9:
                season = "Autumn";
                break;
            case 8:
            case 7:
            case 6:
                season = "Summer";
                break;
            case 5:
            case 4:
            case 3:
                season = "Spring";
                break;

            default:
                season = "2020";
                break;

        }
        return season;

    }
}
