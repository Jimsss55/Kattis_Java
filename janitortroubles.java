import java.util.Scanner;

public class janitortroubles {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        int s4=sc.nextInt();

        double semip=(s1+s2+s3+s4)/2.0;

        janitortroubles send=new janitortroubles();

        send.calculate(s1,s2,s3,s4,semip);
    }    
    public void calculate(int s1,int s2, int s3,int s4, double semip){
        double area=Math.sqrt((semip-s1)*(semip-s2)*(semip-s3)*(semip-s4));
        System.out.println(area);
    }
}
