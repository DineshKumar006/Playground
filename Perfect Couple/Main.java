import java.util.Scanner;
class Main{
    public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr= new int[5];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
          }
      int val=sc.nextInt();
     int sum=0;
      
      for(int j=0;j<n;j++){
        for(int i=j;i<n;i++){
         sum=arr[j]+arr[i];
        if(sum==val){
        System.out.println(arr[j]+", "+arr[i]);
        }
          sum=0;
        
        }
      
      }
      
      
      
      
    }
}