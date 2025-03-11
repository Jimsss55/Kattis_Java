import java.util.Scanner;
public class detaileddifferences {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[num*2];

        for(int i=0;i<(num*2);i++){
            arr[i]=sc.nextLine();
        }
        test(arr);
    }
    public static void test(String arr[]){
        for(int i=0;i<arr.length;i+=2){
            String str1=arr[i];
            String str2=arr[i+1];

            StringBuilder builder=new StringBuilder();

            System.out.println(str1);
            System.out.println(str2);

            for(int j=0;j<str1.length();j++){
                if(str1.charAt(j)==str2.charAt(j)){
                    builder.append('.');
                }
                else{
                    builder.append('*');
                }
            }
            System.out.println(builder.toString());
            System.out.println(" ");
        }
    }

}
