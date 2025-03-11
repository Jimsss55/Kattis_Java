import java.util.Scanner;
public class cold {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];

        for (int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        check(arr);
    }
    public static void check(int arr[]){
        int count =0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<0){
                count ++;
            }
        }
        System.out.println(count);
    }
}
