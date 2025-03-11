import java.util.Scanner;
public class greetings2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean gree=false;

        String s=sc.next();
        char ch[]=s.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='e'){
                output(ch);
            }
            else{
                System.out.print(ch[i]);
            }
        }
    }
    public static void output(char ch[]){
        System.out.print("ee");
    }
} 


