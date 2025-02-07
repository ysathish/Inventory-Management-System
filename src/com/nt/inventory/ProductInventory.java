package com.nt.inventory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class ProductInventory
{
	static Scanner sc=new Scanner(System.in);
	HashMap<Integer,Product> map=new HashMap<>();
	ArrayList<Product> list;
	public void addProduct()
	{
		while(true) {
			System.out.println("enter Product Id:");
			int id=sc.nextInt();
			System.out.println("enter product name:");
			if (map.containsKey(id)) {
				System.out.println("Product with this ID already exists. Please use a different ID.");
				return;
			}
			String name=sc.next();
			System.out.println("enter price:");
			double price=sc.nextDouble();
			System.out.println("enter quantites:");
			int quantity=sc.nextInt();
			Product p=new Product(id,name,price,quantity);
			map.put(p.getProductId(), p);
			System.out.println("product added succesfully");
			System.out.println("\nwant to add more products if yes enter 1 or press eny key to exit:");
			int number=sc.nextInt();
			if(number!=1)
			{
				return;
			}   
		}
	}
	public void removeProduct()
	{
		System.out.println("enter product Id  to remove product:");
		int id=sc.nextInt();
		if(map.containsKey(id))
		{
			map.remove(id);
			System.out.println("your product is removed");
		}
		else {
			System.out.println("product id is not available");
		}
	}
	public void updateQuantity()
	{
		System.out.println("enter Product id to update the quantity:");
		int id=sc.nextInt();
		if(map.containsKey(id))
		{
			Product p=map.get(id);
			System.out.println(p);

			System.out.println("enter new quantity:");
			int quantity=sc.nextInt();

			p.setQuantity(quantity);
			System.out.println("quantity is updated :"+p);
		}
		else
			System.out.println("incorrect product id .Please Try Again.");
	}
	public void displayProduct()
	{
		System.out.println("Enter product Id  will display the details of that product:");
		int id=sc.nextInt();
		if(map.containsKey(id))
			System.out.println(map.get(id));
		else
			System.out.println("incorrect product id .Please Try Again.");
	}
	public void displayAllProducts()
	{
		if(map.isEmpty())
		{
			System.out.println("empty");
		}
		else {
			list=new ArrayList<>(map.values());
			Iterator<Product>i=list.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		}
	}
	public static void main(String[] args) 
	{
		ProductInventory pi=new ProductInventory();
		while(true) {
			System.out.println("******Inventory Management System******\n");
			System.out.println("1. Add a new Product");
			System.out.println("2. Remove a Product");
			System.out.println("3. Update the Quantity of the product");
			System.out.println("4. Display details of the product");
			System.out.println("5. Display details of all products");
			System.out.println("6. Exit the program");
			System.out.println("Enter the listed numbers:");
			int number=sc.nextInt();
			switch(number)
			{
			case 1:
				pi.addProduct();
				break;
			case 2:
				pi.removeProduct();
				break;
			case 3:
				pi.updateQuantity();
				break;
			case 4:
				pi.displayProduct();
				break;
			case 5:
				pi.displayAllProducts();
				break;
			case 6:
				System.out.println("thank you");
				return;
			}
		}
	}
}