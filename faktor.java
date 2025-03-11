import java.util.Scanner;
public class faktor {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int article =sc.nextInt();
        double factor =sc.nextDouble();
        int product=0;

        double fact=(factor-0.9);
        product=(int)fact*article;
        System.out.println(product+1);
    }
    
}
