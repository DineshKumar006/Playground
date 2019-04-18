import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner scan=new Scanner(System.in);
      
      int n=scan.nextInt();
      int sum=0;
      
      while(n>0){
        int n1=n % 10;
        n=n/10;
      sum=sum+n1;
	}
      System.out.println(sum);
}
}