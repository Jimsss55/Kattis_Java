import java.util.Scanner;
public class gcvwr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int g=sc.nextInt();
        int t=sc.nextInt();
        int n=sc.nextInt();
        int sum=0;
        int remaining=0;
        double weight=0;

        for(int i=0;i<n;i++){
            sum+=sc.nextInt();
        }
        remaining=g-t;
        weight=(double)remaining*0.9;

        int total=(int)weight-sum;

        System.out.println(total);
    }
    
}
