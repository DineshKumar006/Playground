import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(Sum(n));
	}
  public static int Sum(int n){
 	int sum=0;	
    for(int i=1;i<=n;i++){
    sum=sum+i;
    
    }
    return sum;
    	
  }
}