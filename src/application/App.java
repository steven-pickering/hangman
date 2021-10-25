package application;


import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String[] words = {"latter", "gentleman", "had", "made", "half", "holiday", "on", "purpose", "thus\n" +
                "gaining", "immense", "advantage", "over", "the", "youngest", "gentleman", "rest", "whose\n" +
                "time", "perversely", "chanced", "bespoke", "until", "the", "evening", "bottle", "wine", "midst\n" +
                "enjoyment"};

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', +
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};


        // selecting random word from words array.
        Random random = new Random();
        int index = random.nextInt(words.length);
        String word = words[index];
        System.out.println(word);

        // get user input char and check if letter is in word
        for (int i = 0; i < 9; i++) {
            System.out.println("Guess a character >  ");
            Scanner scanner = new Scanner(System.in);
            char letter = scanner.next().charAt(0);
            System.out.println(letter);
            // find if letter(char) is in word(String)
            if (word.contains("" + letter)) {
                System.out.println("The word does contain " + letter);
                // code for removing letter from alphabet here
                // code for removing letter(s) from word here
                //  i--;
            } else {
                System.out.println("The word does not contain " + letter);
                // code for removing letter from alphabet
            }
        }


        //  String[] stickman = {"   0_______", " __|__    /'\'", "   |     /  '\'", "  / '\'   /    '\'"};
        int[] stickmanTest = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < stickmanTest.length; i++) {
            System.out.println(stickmanTest[i]);
        }
    }
}


