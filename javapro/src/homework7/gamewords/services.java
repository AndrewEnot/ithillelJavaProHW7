package homework7.gamewords;

import java.util.Random;
import java.util.Scanner;

public class services {

    //TASK #5: Game Words, where we compare word is given by User and word from array (chosen by Computer)
    static void compareWords(String[] strings) {

        System.out.println("Game starts!!!");
        String word = inputWord();
        int index = new Random().nextInt(0, strings.length - 1);
        String wordDiff = strings[index];

        while (!word.equalsIgnoreCase(wordDiff)) {
            StringBuilder result = new StringBuilder();
            System.out.println("Nope( You don't get it...");
            System.out.println("Buuuuut, You have some matching letters) \n");
            for (int i = 0; i < 15; i++) {
                while (i < Math.min(word.length(), wordDiff.length())) {
                    if (word.charAt(i) == wordDiff.charAt(i)) {
                        result.append(word.charAt(i));
                    } else {
                        result.append('#');
                    }
                    i++;
                }
                result.append('#');
            }
            System.out.println(result + "\n");
            System.out.println("Another attempt: ");
            word = inputWord();
        }
        System.out.println("YOU WIN!!! And you may get you prize.... 100$!!!");
    }

    private static String inputWord() {
        Scanner wordIn = new Scanner(System.in);
        System.out.println("Input your word: ");
        String word = wordIn.next();
        System.out.println("You entered: " + word);
        return word;
    }
}
