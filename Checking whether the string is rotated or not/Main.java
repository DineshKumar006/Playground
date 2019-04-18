import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
     				 String str=sc.nextLine();
				    String str2=sc.nextLine();
				    StringBuilder sb=new StringBuilder(str);
				    StringBuilder sb2=new StringBuilder(str2);
				    
				    int len=sb.length();
				    int len2=sb2.length();
				   StringBuilder temp=new StringBuilder("");//empty
				   
				
				   
				   
				   for(int i=0;i<len;i++) {
					   temp.append(sb.charAt(i));
				   }
				   for(int i=0;i<len;i++) {
					   temp.append(sb.charAt(i));
				   }
				   
				int len3=temp.length();  
				boolean flag=false;
      
				int count=0;
				for(int i=0;i<(len3-len2+1);i++) {
					for(int j=0;j<len2;j++) {
						if(temp.charAt(i+j)==sb2.charAt(j)) {
							count++;					
						}
						if(count==str2.length()) {
							flag=true;
						}
							
					}
					
					count=0;
				}
				
				
				if(flag==true) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
				

    }
}