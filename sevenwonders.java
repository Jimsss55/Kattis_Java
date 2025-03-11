import java.util.Scanner;

public class sevenwonders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String wonder = sc.nextLine();
        wonder = wonder.toUpperCase();
        char[] input = wonder.toCharArray();

        int t = 0;
        int c = 0;
        int g = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == 'T') {
                t++;
            } else if (input[i] == 'C') {
                c++;
            } else if (input[i] == 'G') {
                g++;
            }
        }

        int totalPoints = calculatePoints(t) + calculatePoints(c) + calculatePoints(g) + calculateSetPoints(t, c, g);

        System.out.println(totalPoints);
    }

    // Function to calculate points for a given type of card
    private static int calculatePoints(int count) {
        return count * count;
    }

    // Function to calculate points for sets of three different cards
    private static int calculateSetPoints(int t, int c, int g) {
        int minSetCount = Math.min(Math.min(t, c), g);
        return minSetCount * 7;
    }
}
