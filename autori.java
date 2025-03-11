import java.util.Scanner;

public class autori {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        char ch[]=str.toCharArray();

        System.out.print(ch[0]);

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='-'){
                System.out.print(ch[i+1]);
                continue;
            }
        }
    }
}
