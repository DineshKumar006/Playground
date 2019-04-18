//import required packages
import java.util.*;
class Faculty
{
  public void salary(int base)
  {
 System.out.println("Base Salary: "+base);
  }
}
class CSE extends Faculty
{
  public void salary(int base)
  {
    //write your CSE class statements
    int s=base+3000;
 System.out.println("CSE Faculty: "+s);
  }
}
class IT extends Faculty
{
  public void salary(int base)
  {
    //write your IT class statements
    int s=base+5000;
 System.out.println("IT Faculty: "+s);
  }
}
class ECE extends Faculty
{
  public void salary(int base)
  {
    //write your ECE class statements
    int s=base+4500;
 System.out.println("ECE Faculty: "+s);
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int base=sc.nextInt();
    Faculty f=new Faculty();
    CSE c=new CSE();
    IT it=new IT();
    ECE ec = new ECE();
    f.salary(base);
    c.salary(base);
    it.salary(base);
    ec.salary(base);
    //implement your required concept here
  }
}