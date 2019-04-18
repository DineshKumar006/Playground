import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       String str1=sc.nextLine();
      String str2=sc.nextLine();
      int parts=sc.nextInt();
      String str3=str1.replace(str1,str2);
      
      String[] s=str3.split(" ",parts);
      
      for(String res:s){
      System.out.println(res);
      }
      
      
    }
}