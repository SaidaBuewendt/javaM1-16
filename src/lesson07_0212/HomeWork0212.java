package lesson07_0212;

public class HomeWork0212 {
    public static void main(String[] args) {
       /* Напишите программу действий для сотрудника дорожной полиции, который остановил машину:
        при езде до 50 км/час нарушений нет;
        за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
        за превышение скорости от 16 км/час — 40 евро штрафа;
        за езду от 100 км/час до 130 км/час — штраф 500 евро;
        и за езду свыше 130 км/час — штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного
        средства.*/
        System.out.println(determinateFine(131));
        System.out.println("______________");
        //Напишите программу, которая объяснит наступление определённых событий, в зависимости от выбора “витязя”.
        System.out.println(chooseWay("Налево"));

    }

    public static String determinateFine(int speed) {
        String result = "";
        if (speed <= 50) {
            result = "Нарушений нет";
        } else if (50 < speed && speed <= 65) {//первая часть не имеет смысла, тк в первом IF уже отсекли скорость меньше 50
            result = "Устное порицание и лекция на 5 минут";
        } else if (50 + 16 < speed && speed <= 100) {
            result = "40 евро штрафа";
        } else if (100 < speed && speed <= 130) {
            result = "штраф 500 евро";
        } else
            result = "штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного средства";
        return result;
    }

    public static String chooseWay(String direction) {
        direction = direction.toLowerCase();
        System.out.println(direction);
        String result = "";
        if (direction == "налево") {
            result = "Коня потеряешь";
        } else if (direction == "направо") {
            result = "Жизнь потеряешь";
        } else if (direction == "прямо") {
            result = "Жив будешь, да себя позабудешь";
        } else
            result = "Выбери направление";
        return result;

    }

}
