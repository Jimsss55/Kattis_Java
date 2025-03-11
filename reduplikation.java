import java.util.Scanner;
public class reduplikation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int num=sc.nextInt();

        for(int i=0;i<num;i++){
            System.out.print(str);
        }
    }
}
