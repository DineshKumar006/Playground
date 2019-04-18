import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 	  Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
      int num1=n;
      int count=1;
      if(n==0){
        System.out.println(n);
      }else{
        
      while(num1>0){
      count++;
        num1=num1/10;
      
      }
        int num2=n;
        int pow=1;
        int sum=0;
        while(num2>0){
        int rem=num2 % 10;
          for(int i=1;i<count;i++){
          pow=pow*rem;
          
          }
          sum=sum+pow;
          pow=1;
          num2=num2/10;
        }
        if(sum==n){
        	  System.out.println("Armstrong Number");

        }else{
        System.out.println("Not a Armstrong Number");
        }
        
        
        
        
      }
      
      
	}
}