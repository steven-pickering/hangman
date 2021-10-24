package application;


import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String[] words = {"latter", "gentleman", "had", "made", "half", "holiday", "on", "purpose", "thus\n" +
                "gaining", "immense", "advantage", "over", "the", "youngest", "gentleman", "rest", "whose\n" +
                "time", "perversely", "chanced", "bespoke", "until", "the", "evening", "bottle", "wine", "midst\n" +
                "enjoyment"};

        // selecting random word from words array.
        Random random = new Random();
        int index = random.nextInt(words.length);
        String word = words[index];
        System.out.println(word);

        // get user input char
        System.out.println("Guess a character >  ");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        System.out.println(letter);

        // check if user inputted char is in word



        String stickman1 = "   0_______";
        String stickman2 = "__|__    /'\'";
        String stickman3 = "   |     /  '\'";
        String stickman4 = "  / '\'   /    '\'";
    }
}


