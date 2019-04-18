import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*; 
public class Main{
	
	public static void main(String[] args){
	    
      
      Scanner sc=new Scanner(System.in);
		
		String ip=sc.next();
		String date=sc.next();
		final String pattern=
				"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
						"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
						"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
						"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
					   
		final String datepattern="^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{4}$";
		//final String datepattern= "^(1[0-2]|0[1-9])/(3[01]" + "|[12][0-9]|0[1-9])/[0-9]{4}$"; 
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(ip);
		
		Pattern p1=Pattern.compile(datepattern);
		Matcher m1=p1.matcher((CharSequence)date);
		if(m.find()) {
			System.out.println(ip+" is valid? true");
		}else {
			System.out.println(ip+" is valid? false");
		}
		if(m1.find()) {
			System.out.println("Is "+date+" a valid date format? true");
		}else {
			System.out.println("Is "+date+" a valid date format? false");
		}
		
		
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    }
}