import java.util.Scanner;
public class skammstofun {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            String word=sc.next();
            String str[]=word.split(" ");
            cap(str);
        }
    }
    public static void cap(String str[]){
        for(int i=0; i<str.length;i++){
            if(str[i].length()>0 && Character.isUpperCase(str[i].charAt(0))){
                System.out.print(str[i].charAt(0));
            }
        }
    }
}
