import java.util.Scanner;

public class Shiftedmex{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
       
        int t=sc.nextInt();
        for(int i=1;i<t;i++){
            int n=sc.nextInt();
            int[] arr=new int[n];
           
          for(int j=0;j<n;j++){
             arr[j]=sc.nextInt();
             arr[j]+=3;
          }
          for(int k=0;k<n;k++){
            if(k!=arr[k]){
                System.out.println(k);
                break;
            }
          }
        }
        sc.close();
    }
}