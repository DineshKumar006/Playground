import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
    }
    
    fun(a,n);    
  }
  public static void fun(int[] a,int n){
    
    int sum1=0,sum2=0,sum3=0;
    
    for(int i=1;i<=n/3;i++){
    	for(int j=0;j<n;j++){
        	if(j<3){
            sum1=sum1+a[j];
            }
          else if(j>=3 && j<6){
          sum2=sum2+a[j];
          }else{
          sum3=sum3+a[j];
          }
        }
    }
    
    if(n==6){
    
      if(sum1==sum2){
      System.out.println("Perfect Batch");
      }else{
      System.out.println("Not a Perfect Batch");
      }
    }
    else{
    if(sum1==sum2 && sum2==sum3 && sum3==sum1){
    System.out.println("Perfect Batch");
    
    }else{
    System.out.println("Not a Perfect Batch");
    }
    }
    
    //----------------------------------
  
  }
  
}