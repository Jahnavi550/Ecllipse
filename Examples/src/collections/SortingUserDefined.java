package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product1
{
	int id;
	String name;
	double price;
	public Product1(int id, String name, double price) {
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
public class SortingUserDefined {
	public static void main(String args[])
	{
		Product1 p1=new Product1(1001,"apple",50000);
		Product1 p2=new Product1(1002,"sony",40000);
		Product1 p3=new Product1(1003,"voltos",20000);
		Product1 p4=new Product1(1004,"mi",20000);
		ArrayList<Product1> products=new ArrayList<Product1>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		List<Product1> list=products.stream()
		.sorted((a,b)->a.name.compareTo(b.name))
		.collect(Collectors.toList());
		list.forEach(System.out::println);
	}
}
