package _UsefulMethods;

public class MagicColor {
    public static void main(String[] args) {
        myColorPrintTwo();
    }

    private static void myColorPrintTwo() {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";
        System.out.println(ANSI_CYAN + "Hello Word!" + ANSI_RESET);


        final String ANSI_RESET_BACKGROUND = "\u001b[0m";
        final String ANSI_BLACK_BACKGROUND = "\u001b[40m";
        final String ANSI_RED_BACKGROUND = "\u001b[41m";
        final String ANSI_GREEN_BACKGROUND = "\u001b[42m";
        final String ANSI_YELLOW_BACKGROUND = "\u001b[43m";
        final String ANSI_BLUE_BACKGROUND = "\u001b[44m";
        final String ANSI_PURPLE_BACKGROUND = "\u001b[45m";
        final String ANSI_CYAN_BACKGROUND = "\u001b[46m";
        final String ANSI_WHITE_BACKGROUND = "\u001b[47m";
        System.out.println(ANSI_CYAN_BACKGROUND + "Hello Word!" + ANSI_RESET_BACKGROUND);

        System.out.println(ANSI_GREEN_BACKGROUND + "THIS TEXT HAS A GREEN BACKGROUND BY DEFAULT TEXT" + ANSI_RESET);
        System.out.println(ANSI_RED + "THIS TEXT HAS A DEFAULT BACKGROUND BY RED TEXT" + ANSI_RESET);
        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_WHITE + "THIS TEXT HAS A GREEN BACKGROUND BY RED TEXT"+ANSI_RESET);
    }

}