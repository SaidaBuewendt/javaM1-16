package lesson06_0112;

public class ReviewString {
    public static void main(String[] args) {
        String title = "Я памятник себе возвдиг нерукотворный";
        String newTitle = title.toUpperCase();
        System.out.println(newTitle);
        newTitle = newTitle.substring(0,1).toUpperCase();
    }
}
