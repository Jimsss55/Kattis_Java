import java.util.Scanner;
public class filip {
    public static void main(String aargs[]){
        Scanner sc=new Scanner(System.in);

        String str1= sc.next();
        String str2= sc.next();

        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        char temp;

        for(int i=0;i<ch1.length;i++){
            temp=ch1[0];
            ch1[0]=ch1[2];
            ch1[2]=temp;
        }

        for(int i=0;i<ch2.length;i++){
            temp=ch2[0];
            ch2[0]=ch2[2];
            ch2[2]=temp;
        }

        int num1=Integer.parseInt(new String(ch1));
        int num2=Integer.parseInt(new String(ch2)); 


        if(num1>num2){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }
    }
}
