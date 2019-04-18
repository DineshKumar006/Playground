import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      }
      
      int[] rev=new int[n];
      int idx=0;
      for(int i=n-1;i>=0;i--){
       rev[idx]=arr[i];
        idx++;
        }
      
      
      if(Arrays.equals(rev,arr)){
      System.out.println("Yes");
      }else{
        System.out.println("No");
      }
      
      
      
    }
}