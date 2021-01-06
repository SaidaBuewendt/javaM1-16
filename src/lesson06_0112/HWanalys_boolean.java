package lesson06_0112;

public class HWanalys_boolean {
    public static void main(String[] args) {
        System.out.println("Если нажали оба: " + bigBadaBoom(true, true)); // true
        System.out.println("Если никто не нажал: " + bigBadaBoom(false, false));// false
        System.out.println("Если нажал только один: " + bigBadaBoom(true, false));// false
        System.out.println(doorBell(true, false));
    }

    public static boolean bigBadaBoom(boolean officer1, boolean officer2) {
        return officer1 && officer2;
    }

    public static boolean doorBell(boolean door1, boolean door2) {
        //return door1^door2;
        //return !(door1== door2);
        return door1 != door2;
    }


}

