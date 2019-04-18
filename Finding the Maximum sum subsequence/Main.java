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
    int[] seq=new int[2*n];
    //--------------------------------
    int sq=0,start=0;
    for(int i=0;i<n-1;i++){
      if(arr[i]>arr[i+1]){
    	seq[sq]=start;
      	sq++;
      	seq[sq]=i;
      	sq++;
      start=i+1;
      }
    }
    if(start!=n-1){
      seq[sq]=start;
      sq++;
      seq[sq]=n-1;
        sq++;
    }
    
    if(start==n-1){
    seq[sq]=start;
      sq++;
      seq[sq]=n-1;
      sq++;
    }
    int max=0,count=0,j=0;
    for(int i=0;i<sq;i++){
    start=seq[i];
      int end=seq[i+1];
      for(j=start;j<=end;j++){
     // System.out.print(arr[j]+" ");
       count++;
      }
      if(count>max){
      max=count;
      }
       count=0;
    
    }
    
  //   System.out.print("max"+max);
    
    //-----------------------------------------------
    int c=0,sum=0;
     for(int i=0;i<sq;i++){
    start=seq[i];
      int end=seq[i+1];
      for(j=start;j<=end;j++){
        c++;
    if( c==3){
     for(int k=start;k<=end;k++){
       sum=sum+arr[k];
     }
    }

      }
       c=0;
     }
     System.out.println(sum);
    
    
  }
}