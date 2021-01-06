package lesson08_0312;

public class HelloFor {
    public static void main(String[] args) {
        myWeek();
    }

    public static void myWeek() {
        int weekDays = 7;
        //начало
        //условие
        //шаг
        for (int i = 0; i < weekDays; i++) { //i++ - это i=  i+1 // от 0 до 7 с шагом i+1
            //for (int i = 1; i < weekDays; i++) { //i++ - это i=  i+1 // от 1 до 7 с шагом i+1
            System.out.println("--------");
            System.out.println("Я встаю в 5 утра");
            System.out.println("Завтракаю");
            System.out.println("Иду на работу");
            System.out.println("Прихожу с работы");
            System.out.println("Ужинаю");
            System.out.println("Смотрю Нетфликс");
            System.out.println("Иду спать");
            System.out.println("*********");
            System.out.println(i);
        }
    }
}
