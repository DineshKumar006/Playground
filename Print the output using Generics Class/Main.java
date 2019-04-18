import java.util.*;
public class Main<T> 
{ 
  
	public  void display(String str,T a) {
		
		System.out.println(str+""+a);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		float f=sc.nextFloat();
		
		Main<Integer>  intdata=new Main<Integer>();
		Main<String>  strdata=new Main<String>();
		Main<Float>  fdata=new Main<Float>();
		
		intdata.display("Integer Value: ",n);
		strdata.display("String Value: ",s);
		fdata.display("Float value: ",f);
		
		
	}
 }