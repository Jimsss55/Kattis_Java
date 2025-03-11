
import java.util.Scanner;
public class oddecho {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String arr[]=new String[num];

        for(int i=0;i<num;i++){
            arr[i]=sc.next();
            continue;
        }
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
    }
    
}
