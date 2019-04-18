import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
      for(int i=2;i<=n;i++){
      if(isprime(i)){
      System.out.println(i);
      }   
	}
         }
  public static boolean isprime(int m){
  		
    boolean flag=true;
    for(int i=2;i<=m/2;i++){
    if(m % i==0){
    flag=false;
      break;
    }  
    }
    return flag;
  
  }
}