import java.util.Scanner;

public class flatbokuveisla {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        int sum=n/m;

        int out=n-(sum*m);

        System.out.println(out);
    }    
}
