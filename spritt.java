import java.util.Scanner;

public class spritt {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int c=sc.nextInt();
        int availiable=sc.nextInt();

        int sum=0;

        for(int i=0;i<c;i++){
            int a=sc.nextInt();
            sum=sum+a;
        }
        if(sum<=availiable){
            System.out.println("Jebb");
        }
        else{
            System.out.println("Neibb");
        }

    }    
}
