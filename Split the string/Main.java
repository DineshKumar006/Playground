import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main{
    public static void main(String args[]){
          // type your code here
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String[] s=str.split("\\s|,|and|or");;

for(int i=0;i<s.length;i++) {
	System.out.println(s[i]);
}
      
      
    }
}