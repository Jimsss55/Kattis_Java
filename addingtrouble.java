import java.util.Scanner;

public class addingtrouble {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int ans=sc.nextInt();

        check(ans,num1,num2);
    }    

    public static void check(int ans,int num1,int num2){
        int sum=num1+num2;

        if(sum==ans){
            System.out.println("correct!");
        }
        else{
            System.out.println("wrong!");
        }

    }
}
