import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      StringBuffer sb=new StringBuffer(str);
      int len=str.length();
      int[] fq=new int[26];
      
      for(int i=0;i<26;i++){
      fq[i]=0;
      }
      for(int i=0;i<len;i++){
      if(sb.charAt(i)>='a' && sb.charAt(i)<='z'){
        fq[sb.charAt(i)-'a']++;
      
      }
        if(sb.charAt(i)>='A' && sb.charAt(i)<='Z'){
        fq[sb.charAt(i)-'A']++;
        }
      }
      //---------------
      
      for(int i=0;i<26;i++){
        if(fq[i]==0){
        char missing=(char)(i+'a');
          System.out.print(missing+" " );
        }
      
      }
      
      
      
      
    }
}