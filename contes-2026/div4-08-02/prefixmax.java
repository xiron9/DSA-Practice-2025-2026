import java.util.Scanner;

public class prefixmax {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int t=sc.nextInt();
    for(int i=1;i<t;i++){
      int n=sc.nextInt(); //array size
      int[] arr=new int[n];
      int max=0;
      for(int j=0;j<n;j++){
         arr[j]=sc.nextInt();
         if(max<arr[j]){
            max=arr[j];
         }
         
      }
      System.out.println(max*n);
     } 
     sc.close();   
    }
}
