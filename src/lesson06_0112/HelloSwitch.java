package lesson06_0112;

public class HelloSwitch {
    //SWITCH - это оператор выбора, ключевое слово, конструкт
    /*
    За пятерку по контрольной в Java - велосипед
    За четверку  - GoPro новая
    За тройку - не поругают
    За двойку - отругают
    За единицу - "Лучше и не спрашивай"
     */

    public static void main(String[] args) {
        int semesterScore = 1;
        int score = 3;
        myFirstSwitch(semesterScore);
        myFirstSwitch(score);
        myFirstSwitch(4);
        System.out.println(myFirstSwitch(5));
    }

    public static String myFirstSwitch(int schoolScore) {
        String prize = ""; //инициализация будет определена позже
        switch (schoolScore) {
            case 1:
                prize = "Лучше и не спрашивай";
                break;
            case 2:
                prize = "За двойку отругают";
                break;
            case 3:
                prize = "Не поругают ";
                break;
            case 4:
                prize = "GoPro новая";
               // break Если убрать BREAK, то программа сразу переходит к след кейсу и перезаписывает значение
            case 5:
                prize = "Велосипед";
                break;
            default:
                prize = "Такой оценки не существует";
                break;
        }
        return prize;
    }
}
