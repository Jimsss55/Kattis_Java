import java.util.Scanner;

public class nastyhacks {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();


        for(int i=0;i<num;i++){
            int r=sc.nextInt();
            int e=sc.nextInt();
            int c=sc.nextInt();
            
            calculate(r,e,c);
        }
    }    

    public static void calculate(int r,int e,int c){
        if((e-r)>c){
            System.out.println("advertise");
        }
        else if((e-r)<c){
            System.out.println("do not advertise");
        }
        else{
            System.out.println("does not matter");
        }
    }
}
