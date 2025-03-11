import java.util.Scanner;
public class everywhere {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();


        for(int i=0;i<test;i++){
            int num=sc.nextInt();
            String city[]=new String[num];
            
            for (int j=0;j < num;j++){

                city[j]=sc.next();
            }
            output(city);

        }
    }
    public static void output(String city[]){
        int count=0;
        for(int i=0;i<city.length-1;i++){
            for(int j=0;j<i;j++){
                if(city[i].equals(city[j+1])){
                continue;
            }
            else{
                count++;
            }

            }
        }
        System.out.println(count);
    }
}



