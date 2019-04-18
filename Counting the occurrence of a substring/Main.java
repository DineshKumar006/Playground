import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
    String str2=sc.nextLine();
    StringBuilder sb=new StringBuilder(str);
    StringBuilder sb2=new StringBuilder(str2);
      int len=str.length();
    int len2=str2.length();
     int count=0;
    
    for(int i=0;i<len-len2+1;i++){
       boolean flag=true;
      for(int j=0;j<len2;j++){
      if(sb.charAt(i+j)!=sb2.charAt(j)){
         flag=false;
      }
      }
        if(flag==true){
        count++;
        }
      
      
    }
     System.out.println(count);
    
    
    
    
    
  } 
}