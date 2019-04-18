import java.util.Scanner;
class Main{
	public static void main (String[] args){
	      Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
      int num1=n;
      int sum=0;
      int fact=1;
      while(num1>0){
      
        int rem=num1%10;
        for(int i=1;i<=rem;i++){
        
        fact=fact*i;
        }
        
        sum=sum+fact;
        fact=1;
        num1=num1/10;
      
      }
      if(sum==n){
      System.out.println("Yes");
      }else{
      System.out.println("No");
      }
      
      
      
	}
}