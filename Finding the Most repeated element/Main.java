import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
    }
    //---------------------------------------
    int max_fq=0,count=0;
    for(int i=0;i<n;i++){
    	for(int j=0;j<n;j++){
        	if(arr[i]==arr[j]){
            count++;
            }
        }
      if(count>max_fq){
      max_fq=arr[i];
      }
      count=0;
    
    }
    System.out.println(max_fq);
    
    
    
    
    
    
  
  }
}