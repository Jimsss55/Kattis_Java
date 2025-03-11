import java.util.Scanner;

public class vidsnuningur {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] character=str.toCharArray();

        for(int i=character.length-1;i>=0;i--){    
            System.out.print(character[i]);
        }
    }
}