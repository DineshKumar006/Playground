import java.io.*;

class Fibonacci extends Thread
{
public void run() {
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	
	
		try {
			int a=Integer.parseInt(bf.readLine());
            System.out.println("Enter the limit for Fibonacci: "+a);
			if(a<=0) {
				Thread.interrupted();
				System.out.println("Exception occurred");
			}else {
            
            System.out.print("The Fibonacci series is :");
			int n1=0,n2=1,next=0;
			System.out.print(n1+" "+n2+" ");
			for(int i=2;i<a;i++) {
				
				next=n1+n2;
				n1=n2;
				n2=next;
				
				System.out.print(next+" ");
				}
			}
		}
		catch(IOException e) {
		
		}
	}	
}
class Main
{
     public static void main(String[] args) 
     {
       	Fibonacci t=new Fibonacci();
		t.start();
		
     }
}