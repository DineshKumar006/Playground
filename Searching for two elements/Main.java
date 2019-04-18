import java.util.Scanner;
class Main{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      }
     
      int s_ele1=sc.nextInt();
      int s_ele2=sc.nextInt();
      int j=0;
       int match1=0;
      for(j=0;j<n;j++){
      	if(arr[j]==s_ele1){
        match1=1;
          break;
        } 
      }
      int match2=0;
      int k=0;
       for( k=0;k<n;k++){
      	if(arr[k]==s_ele2){
       match2=1;
          break;
        } 
      }
      if(match1==1){
      System.out.println(j);
      }
       if(match2==1){
      System.out.println(k);
      }
      else{
      System.out.println("-1");
      }
      
      
    }
}