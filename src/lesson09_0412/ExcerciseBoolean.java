package lesson09_0412;

public class ExcerciseBoolean {
    public static void main(String[] args) {
        /* When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is
        between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars.
                Return true if the party with the given values is successful, or false otherwise.*/
        System.out.println(cigarParty1(30, false)); //false
        System.out.println(cigarParty1(50, false)); //true
        System.out.println(cigarParty1(70, true)); //true
        System.out.println(cigarParty1(70, false)); //false

        System.out.println(cigarParty2(30, false));
        System.out.println(cigarParty2(50, false));
        System.out.println(cigarParty2(70, true));
        System.out.println(cigarParty2(70, false));

        System.out.println(cigarParty3(70, true));


       /* You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value:
        0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the
        result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all
        cases.*/
        System.out.println(caughtSpeeding(60, false)); //0
        System.out.println(caughtSpeeding(65, false)); //1
        System.out.println(caughtSpeeding(65, true)); //0
        System.out.println(caughtSpeeding(81, false)); //2
        System.out.println(caughtSpeeding(81, true)); //1

/*        3. The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or
        difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.*/
        System.out.println(love6(6, 4));
        System.out.println(love6(4, 5));
        System.out.println(love6(1, 5));

    }

    private static boolean cigarParty1(int cigars, boolean weekend) {
        if (cigars < 40) {
            return false;
        } else if (cigars < 60 && !weekend) {
            return true;
        } else if (cigars > 60 && weekend) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean cigarParty2(int cigars, boolean weekend) {
        if (cigars > 40 && cigars < 60 && !weekend) {
            return true;
        } else if (cigars > 60 && weekend) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean cigarParty3(int cigars, boolean weekend) {
        return (cigars > 40 && cigars < 60 && weekend) || (cigars > 60 && weekend);
    }

    public static int caughtSpeeding(int speed, boolean birthday) {
        if (birthday) {
            speed = speed - 5;
        }
        if (speed <= 60) {
            return 0;
        } else if (speed <= 80) {
            return 1;
        } else {
            return 2;
        }
    }

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        } else if ((a + b) == 6) {
            return true;
        } else if (Math.abs(a - b) == 6) {
            return true;
        }else return false;
    }


    private static boolean love6Second(int a, int b) {
        int sum = a + b;
        int dif = Math.abs(a - b);
        return (a == 6 || b == 6) || sum == 6 || dif == 6;
    }
}

