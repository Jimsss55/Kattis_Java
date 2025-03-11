import java.util.Scanner;
public class sottkvi {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int birthday = sc.nextInt();
        int today = sc.nextInt();

        int charo[] = new int[n];

        int date = birthday + today;

        for (int i = 0; i < n; i++) {
            charo[i] = sc.nextInt();
        }

        int count = party(charo, date);
        System.out.println(count);
    }

    public static int party(int charo[], int date) {
        int count = 0;
        for (int i = 0; i < charo.length; i++) {
            int quarantine = charo[i] + 14;

            if (quarantine <= date) {
                count++;
            }
        }
        return count;
    }
}
