package HomeWork;

public class ExercisesLogic {
    public static void main(String[] args) {
//        20. Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and
//     23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
        System.out.println(shareDigit(12, 23));//→ true
        System.out.println(shareDigit(12, 43));//→ false
        System.out.println(shareDigit(12, 44));//→ false
        System.out.println(shareDigit(11, 11));//→ true
        System.out.println(shareDigit(12, 75));//→ false
        System.out.println("___________________");

//        The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90
//        (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean is Summer,
//        return true if the squirrels play and false otherwise.
        System.out.println(squirrelPlay(70, false));//→ true
        System.out.println(squirrelPlay(95, false));// → false
        System.out.println(squirrelPlay(95, true));// → true
        System.out.println(squirrelPlay(30, true));// → false
        System.out.println(squirrelPlay(30, false));// → false
        System.out.println("___________________");

//        22. Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a
//        string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the
//        weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should
//        be "off".
        System.out.println(alarmClock(1, false));// → "7:00"
        System.out.println(alarmClock(5, false));// → "7:00"
        System.out.println(alarmClock(0, false));// → "10:00"
        System.out.println(alarmClock(2, true));// → "10:00"
        System.out.println(alarmClock(6, true));// → "off"
        System.out.println("___________________");

//        23. We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
//        Return true if the given nonnegative number is special. Use the % "mod" operator -- see Introduction to Mod
        System.out.println(specialEleven(22));// → true
        System.out.println(specialEleven(23));// → true
        System.out.println(specialEleven(24));// → false
        System.out.println(specialEleven(111));// →true
        System.out.println(specialEleven(112));// → false
        System.out.println(specialEleven(109));// → false
        System.out.println("___________________");

//        24. Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but
//        40 returns false. See also: Introduction to Mod
        System.out.println(less20(18)); //→true
        System.out.println(less20(19)); //→true
        System.out.println(less20(20)); //→false
        System.out.println(less20(38)); //→true
        System.out.println(less20(39)); //→true
        System.out.println(less20(40)); //→false
        System.out.println("___________________");


//        25. Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it
//        is your mom calling. In all cases, if you are asleep, you do not answer.
//        System.out.println(answerCell(false, false, false)); //→ true
//        System.out.println(answerCell(false, false, true)); //→ false
//        System.out.println(answerCell(true, false, false)); //→ false
//        System.out.println(answerCell(true, true, false)); //→ true


    }

/*    private static boolean answerCell(boolean morning, boolean mother, boolean sleep) {
        if (sleep || morning) {
            return false;
        } else if (morning && mother) {
            return true;
        }else return false;
    }*/

    private static boolean less20(int number) {
        return ((number + 1) % 20 == 0 || (number + 2) % 20 == 0);
    }

    private static boolean specialEleven(int number) {
        return (number % 11 == 0 || number % 11 == 1);
    }

    private static String alarmClock(int day, boolean vacation) {
        if ((day == 6 || day == 0) && vacation) {
            return "OFF";
        } else if (day > 0 && day < 6 && vacation) {
            return "10:00";
        } else if (day > 0 && day < 6) {
            return "7:00";
        } else return "10:00";
    }

    private static boolean squirrelPlay(int a, boolean b) {
        if (a >= 60 && a <= 100 && b == true) {
            return true;
        } else if (a >= 60 && a <= 90) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean shareDigit(int a, int b) {

        if (a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b / 10 || a % 10 == b % 10) {
            return true;
        } else {
            return false;
        }
    }
}
