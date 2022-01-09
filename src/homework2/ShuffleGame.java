package homework2;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class ShuffleGame {
    Scanner sc = new Scanner(System.in);

    public int[] shuffleGame(int[] ar) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt( i + 1);
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
        return ar;

    }
    public void guess(int[] list, int guess) {
        if(list[guess] == guess) {
            System.out.println("Good guess!");}
        else {
            System.out.println("Wrong guess");
        }
    }

    int[] starting_array = {1,0,1};

    public int pick() {
        int index;
        char number=0;
        while (number != '1' && number != '2' && number != '3') {
            System.out.println("Pick a number 1, 2 or 3");
            number = sc.next().charAt(0);
            if(number == '1' && number == '2' && number == '3') {
                break;
            }
        }
        index = Integer.parseInt(String.valueOf(number))-1;
        return index;
    }

    public void answer() {
        char answer=0;
        while (answer != 'y' && answer != 'n') {
            System.out.println(" y/n: ");
            answer=sc.next().charAt(0);
            if(answer == 'y'&& answer == 'n') {
                break;
            }
        }
        if (answer == 'y') {
            guess(shuffleGame(starting_array), pick());
            System.out.println();
            System.out.println("Do you want to try again?");
            answer();
        }else {
            System.out.println("See you next time!!!");



        }
    }
}
