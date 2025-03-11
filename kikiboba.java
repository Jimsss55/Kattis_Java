import java.util.Scanner;

public class kikiboba {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        String str=sc.nextLine();
        char ch[]=str.toCharArray();

        int k=0;
        int b=0;

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='k'){
                k++;
            }
            else if(ch[i]=='b'){
                b++;
            }
        }
        if(k>b){
            System.out.println("kiki");
        }
        else if(b>k){
            System.out.println("boba");
        }
        else if(k==b){
            if(k>0){
                System.out.println("boki"); 
            }
            else{
                System.out.println("none");
            }
        }
    }    
}
