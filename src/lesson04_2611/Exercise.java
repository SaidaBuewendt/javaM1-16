package lesson04_2611;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Exercise {
    public static void main(String[] args) {
        System.out.println(helloName("Bob"));  //  "Hello Bob!"
        System.out.println(helloName("Alice")); //  "Hello Alice!"
        System.out.println(helloName("X"));//  "Hello X!"


    }

    public static String helloName(String name) {
        String hello = "Hello, ";
        char lastsymbol = '!';
        String welcome = hello + name + lastsymbol;
        return welcome;
        //return "Hello, " + name + "!";
    }
}
