import java.util.Scanner;
public class ladder {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int opp=sc.nextInt();
        int angle=sc.nextInt();

        double radian=Math.toRadians(angle);

        try{
            double hypo=opp/Math.sin(radian);
            System.out.println((int)Math.ceil(hypo));
        }
        catch(Exception e){
            System.out.println("Divided by 0");
        }
    }
}
