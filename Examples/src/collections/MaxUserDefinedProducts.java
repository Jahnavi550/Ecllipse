package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product3
{
	int id;
	String name;
	String price;
	public Product3(int id, String name, String price) {
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
public class MaxUserDefinedProducts {
	public static void main(String args[])
	{
		Product3 p1=new Product3(1001,"apple","50000");
		Product3 p2=new Product3(1002,"sony","40000");
		Product3 p3=new Product3(1003,"voltos","20000");
		Product3 p4=new Product3(1004,"mi","20000");
		Product3 p5=new Product3(1005,"apple","60000");
		Product3 p6=new Product3(1006,"sony","24000");
		Product3 p7=new Product3(1007,"apple","90000");
		Product3 p8=new Product3(1008,"apple","70000");
		ArrayList<Product3> products=new ArrayList<Product3>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		products.add(p7);
		products.add(p8);
		List<Product3> c=
		products.stream()
				.filter(p->p.name.equals("apple"))
				//.max((Product3 a,Product3 b)->a.price<b.price?-1:1)
				.sorted((a,b)->a.price.compareTo(b.price))
				.collect(Collectors.toList());
				//.get();
		System.out.println(c);
	}
}
