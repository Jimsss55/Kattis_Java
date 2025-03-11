import java.util.Scanner;
public class trik {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        String str=sc.next();
        char ch[]=str.toCharArray();
        int arr[]={1,2,3};

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='A'){
                swapA(ch,arr);
            }

            else if(ch[i]=='B'){
                swapB(ch,arr);
            }
            else if(ch[i]=='C'){
                swapC(ch,arr);
            }

        }
        System.out.println(indexOf(arr));
    }
    public static void swapA(char ch[],int arr[]){
        int index1=0;
        int index2=1;

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void swapB(char ch[], int arr[]){
        int index=1;
        int index1=0;

        int temp=arr[index];
        arr[index]=arr[index1];
        arr[index1]=temp;
    }

    public static void swapC(char ch[], int arr[]){
        int index=0;
        int index1=2;

        int temp=arr[index];
        arr[index]=arr[index1];
        arr[index1]=temp;
    }
    public static int indexOf(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i + 1;
            }
        }
        return -1;
    }
    
}
