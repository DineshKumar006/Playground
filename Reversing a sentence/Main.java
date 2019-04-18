import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
    StringBuilder sb=new StringBuilder(str);
      int len=str.length();
      // str reverse
      reverse_string(sb,0, len-1);
      //word reverse
     int  start=0;
      for(int i=0;i<len;i++){
      if(sb.charAt(i)==' '){
      reverse_string(sb,start, i-1);
        start=i+1;
      }
        else if(i==len-1){
      reverse_string(sb,start, i-1);
         start=i+1;
      }
        
      }
       System.out.print(sb);
     
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
      int front= start_idx,end=end_idx;
      
      while(front<end){
      char temp=sb.charAt(front);
        sb.setCharAt(front,sb.charAt(end));
        sb.setCharAt(end,temp);  
        front++;
        end--;
      }
   //   System.out.print(sb);
  
    }
}