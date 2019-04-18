import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
    Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        StringBuilder sb3 = new StringBuilder(str3);
        StringBuilder temp = new StringBuilder("");
        int len1 = sb1.length();
        int len2 = sb2.length();
        int len3 = sb3.length(); 
      int i=0;
      for(i=0;i<(len1-len2+1);i++){
      boolean match=true;
        for(int j=0;j<len2;j++){
        if(sb1.charAt(i+j)!=sb2.charAt(j)){
        match=false;
        }
        }
        if(match==true){
        String st=sb3.substring(0,len3);
          temp.append(st);
          i=i+(len2-1);
        }else{
       temp.append(sb1.charAt(i));
        }
      }
      //--------------------
      for(int j=i;j<=(len1-1);j++){
      temp.append(sb1.charAt(j));
      }
      
      System.out.println(temp);
      
      
      
    }
}