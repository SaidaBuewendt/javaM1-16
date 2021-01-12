package lesson27_1201;

public class MyLovelyIndexOf {
    public static void main(String[] args) {
        String hm = "Василий";
        int magicNumber = hm.lastIndexOf("с", 4);
        String prefix = "abc";
        String word = "abcxyabc";
        System.out.println(word.indexOf(prefix, 1));
    }
}
