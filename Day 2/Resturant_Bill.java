import java.util.Scanner;

public class Resturant_Bill {
    public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	float price1,price2,price3,tax;
	System.out.println("price 1 :");
        price1= sc.nextFloat();
	System.out.println("price 2 :");
	price2=sc.nextFloat();
	System.out.println("price 3 :");
	price3=sc.nextFloat();
	System.out.println("tax % :");
	tax=sc.nextFloat();
	float total= price1+price2+price3;
	float tax_all = (tax/100)*total;
	float finalAmount = tax_all+total;
        System.out.println("Final Amount : "+finalAmount);
	}
   
}
/* Output
price 1 :
44.5
price 2 :
200.87
price 3 :
99.99
tax % :
18
Final Amount : 407.52478
BUILD SUCCESSFUL (total time: 32 seconds) 
*/