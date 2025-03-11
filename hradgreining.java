import java.util.Scanner;
public class hradgreining {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        
        String dna=sc.nextLine();
        dna=dna.toLowerCase();

        hradgreining test=new hradgreining();
        test.covid(dna);
    }
    
    public void covid (String dna){
        char arr[]=dna.toCharArray();
        boolean found=false;
        for(int i=0;i<=arr.length-3;i++){
            if(arr[i]=='c' && arr[i+1]=='o' && arr[i+2]=='v'){
                found=true;
                break;
            }
        }
        
        if(found){
            System.out.println("Veikur!");
        }
        else{
            System.out.println("Ekki veikur!");
        }
    }
}

