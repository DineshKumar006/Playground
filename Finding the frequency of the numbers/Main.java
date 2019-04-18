import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
       int k=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      }
      
//----------------------------------------
      int[] k1=new int[k];
      int idx=1;
      for(int i=0;i<k;i++){
      k1[i]=idx;
        idx++;
      }
//--------------------------------
      int count=0;
      for(int i=0;i<k;i++){
      	for(int j=0;j<n;j++){
        if(k1[i]==arr[j]){
        count++;
        } 
        }
        System.out.println(k1[i]+" "+count);
         count=0;
          }

    }
}