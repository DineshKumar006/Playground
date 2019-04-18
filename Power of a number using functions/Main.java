import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    System.out.println(power(n1,n2));
  }
  public static int power(int base,int exp){
  		int res=1;
    for(int i=1;i<=exp;i++){
    	res=res* base;
    
    }
    return res;
    
        
  
  }
}