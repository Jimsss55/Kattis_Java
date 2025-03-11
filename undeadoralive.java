import java.util.Scanner;
public class undeadoralive {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        boolean check=true;

        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==':'&& ch[i+1]==')' ){
                System.out.println("alive");
                check=true;
                break;
            }
            else if(ch[i]==':' && ch[i+1]=='('){
                System.out.println("undead");
                check=true;
                break;
            }

            else if (ch[i]==':' && ch[i+1]==':' && ch[i+2]=='('){
                System.out.println("double agent");
                check=true;
                break;
            }
        }
        if(!check){
            System.out.println("machine");
        }
    }
}