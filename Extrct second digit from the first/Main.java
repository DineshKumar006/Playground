import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner scan=new Scanner(System.in);
      
      int n=scan.nextInt();
      
      while(n>1000){
      n=n / 100;
      
      }
      if(n>100 && n<1000){
      n=n /10;
      
      }
      if(n>0 && n<100){
      	int num=n % 10;
       System.out.println(num);
      }
      
     
   
	}
}