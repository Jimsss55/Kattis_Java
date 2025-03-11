import java.util.Scanner;

public class vefthjonatjon{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();

        int server=0;

        int numServers=0;
        
        char[] cpuStatus = new char[numServers];
        char[] memoryStatus = new char[numServers];
        char[] hardDriveStatus = new char[numServers];

        for (int i=0;i<=num;i++){
            String alpha1=sc.nextLine();

            if(alpha1.contains("J") && alpha1.contains("J") && alpha1.contains("J")){
                server++;
            }
        }
        System.out.println(server);
    }
}