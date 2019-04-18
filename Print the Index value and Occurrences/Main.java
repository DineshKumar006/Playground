import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
     BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
      String pattern;
	try {
		pattern = buff.readLine();
		 String match=buff.readLine();
	      Pattern p=Pattern.compile(pattern);
	      Matcher m=p.matcher(match);
	      int i=1;
	      while(m.find()){
	      System.out.println("found: "+i+" : "+m.start()+" - "+m.end());
	      i++;
	      }
      if(i<=1){
       System.out.println("The given word is not present in the string");
      }else{
      System.out.println(i-1);
      }
	} catch (IOException e) {
	
		e.printStackTrace();
	}
     
    }
}