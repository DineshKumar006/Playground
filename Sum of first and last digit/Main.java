import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner scan=new Scanner(System.in);
      
      int n=scan.nextInt();
      
      int num1=n;
      int num2=n;
      
      while(num1>10){
      num1=num1 / 10;
      
      }
      
      while(num2>10){
      num2=num2 % 10;
      
      }
      int sum=num1+num2;
      System.out.println(sum);
      
      
      
      
      
	}
}