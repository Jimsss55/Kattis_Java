import java.util.Scanner;
public class countthevowels {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        char ch[]=str.toCharArray();
        int count=0;

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
