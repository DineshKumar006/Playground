import java.util.Scanner;
class Main{
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      int len=str.length();
      int front=0,end=len-1;
	boolean flag=true;
      while(front<end){
      if(str.charAt(front)!=str.charAt(end)){
        flag=false;
      }
          front++;
        end--;
      }
        
        if(flag==true){
          System.out.println("Yes");
      }else{
        System.out.println("No");
        }
      
      
      
      
    } 
}