import java.util.Scanner;

public class bijele {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];

        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        pieces(arr);
    }
    
    
    public static void pieces(int arr[]){

        int [] correct={1,1,2,2,2,8};
        for(int i=0;i<arr.length;i++){
            System.out.print(correct[i]-arr[i]+" ");
        }
    }
}
