import java.util.Scanner;
public class sibice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        int width=sc.nextInt();

        int height=sc.nextInt();

        for(int i=0;i<num;i++){
            int match=sc.nextInt();

            calculate(match,width,height);
        }
    }

    public static void calculate(int match,int width,int height){
        if(match<=Math.sqrt((height*height)+(width*width))){
            System.out.println("DA");
        }
        else{
            System.out.println("NE");
        }
    }
}
