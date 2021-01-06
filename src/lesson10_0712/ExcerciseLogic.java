package lesson10_0712;

public class ExcerciseLogic {
    public static void main(String[] args) {
        /*6. We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or
        2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the
        amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always
        bad (0).*/
        System.out.println(teaParty(6, 8));
        System.out.println(teaParty(3, 8));
        System.out.println(teaParty(20, 6));

        System.out.println(teaParty2(6, 8));
    }

    public static int teaParty(int tea, int candy) {
      /*  if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea > 5 && candy > 5) {
            return 1;
        } else if (tea >= candy * 2 || candy >= tea * 2) {
            return 2;
        }*/

        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= candy * 2 || candy >= tea * 2) {
            return 1;
        } else {
            return 0;
        }

    }

    public static int teaParty2(int tea, int candy) {
        if (tea >= candy * 2 || candy >= tea * 2 && tea >= 5 && candy >= 5) {
            return 2;
        } else if (tea < 5 || candy < 5) {
            return 1;
        } else {
            return 0;
        }

    }
}


