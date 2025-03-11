import java.text.DecimalFormat;
import java.util.Scanner;
public class grassseed {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        float cost=sc.nextFloat();
        DecimalFormat df=new DecimalFormat("0.0000000");


        int lawns=sc.nextInt();
        float product=0;
        float total=0;

        for(int i=0;i<lawns;i++){
            float width=sc.nextFloat();            
            float length=sc.nextFloat();
            product=width*length;
            total+=product;
        }
        total*=cost;
        System.out.println(df.format(total));

    }
}
