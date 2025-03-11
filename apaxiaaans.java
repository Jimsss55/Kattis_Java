import java.util.Scanner;
public class apaxiaaans {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        String str=sc.next();
        str.toLowerCase();
        char ch[]=str.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(i < ch.length-1 && ch[i]==ch[i+1]){
                continue;
            }
            System.out.print(ch[i]);
        }
    }
    
}