import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      StringBuffer sb=new StringBuffer(str);
      int len=str.length();
      int[] fq=new int[100];
      
      for(int i=0;i<100;i++){
      fq[i]=0;
      }
      //-----------
      for(int i=0;i<len;i++){
      if(sb.charAt(i)>='A' && sb.charAt(i)<='Z'){
        int offset=sb.charAt(i)-'A';
        char ch=(char)(offset+'a');
        sb.setCharAt(i,ch);
      }
        if(sb.charAt(i)>='a' && sb.charAt(i)<='z'){
          fq[sb.charAt(i)-'a']++;
        }
        
      }
      //------------
      
      for(int i=0;i<len;i++){
        if(fq[sb.charAt(i)-'a']!=0){
        System.out.print( sb.charAt(i)+""+fq[sb.charAt(i)-'a']+" "  );
          fq[sb.charAt(i)-'a']=0;
          
        }
     
      }   
 
      
    }
}