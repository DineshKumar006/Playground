//import required packages here
import java.util.*;
class Item
{
private int price;
public void setPrice(int p){
	this.price=p;
}

public int getPrice() {
	return price;
}
}
 
class Customer 
{
private String product;
private int quantity;
//create various method to return attribute value(s)
public void setProduct(String product) {
	this.product=product;
}

public void setQuantity(int q) {
	this.quantity=q;
}

public String getProduct() {
	return this.product;
}
public int getQuantity() {
	return this.quantity;
}

}

class Bill
{
//implement your logic to calculate total pri
		public void setBill(int price,int q) {
			
			System.out.println("Total Price is : "+price * q);
		}	
}
class Main
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();
	int price=sc.nextInt();
	int num=sc.nextInt();
	
  Item i = new Item();
  Customer c = new Customer();
 
  c.setProduct(name);
  i.setPrice(price);
  c.setQuantity(num);

  Bill obj = new Bill();
   obj.setBill(price, num);
  }
}