import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      System.out.println(gcd(n1,n2,n3));
	    
	}
  public static int gcd(int n1,int n2,int n3){
    int min=0,GCD=0;
  		if(n1<n2 && n1<n3){
        min=n1;
        }
    if(n2<n1 && n2<n3){
        min=n2;
        }
    if(n3<n1 && n3<n2){
        min=n3;
        }
    
    while(min>=1){
      if((n1 % min==0) && (n2 % min==0) && (n3 % min==0)){
        	GCD=min;	
        break;
      }
      min--;
  }
    return GCD;
  }
}