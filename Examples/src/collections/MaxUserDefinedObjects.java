package collections;

import java.util.ArrayList;
class Product2
{
	int id;
	String name;
	double price;
	public Product2(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class MaxUserDefinedObjects {
	public static void main(String args[])
	{
		Product2 p1=new Product2(1001,"samsung",50000);
		Product2 p2=new Product2(1002,"sony",40000);
		Product2 p3=new Product2(1003,"voltos",20000);
		Product2 p4=new Product2(1004,"loyd",20000);
		ArrayList<Product2> products=new ArrayList<Product2>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		Product2 p=products.stream()
				.min((Product2 a,Product2 b)->a.price<b.price?-1:1)
				.get();
		System.out.println(p);
	}
}
