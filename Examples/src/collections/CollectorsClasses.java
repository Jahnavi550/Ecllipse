package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product4
{
	int id;
	String name;
	double price;
	public Product4(int id, String name, double price) {
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
public class CollectorsClasses {
	public static void main(String args[])
	{
		Product4 p1=new Product4(1001,"apple",50000);
		Product4 p2=new Product4(1002,"sony",40000);
		Product4 p3=new Product4(1003,"voltos",20000);
		Product4 p4=new Product4(1004,"mi",20000);
		ArrayList<Product4> productsList=new ArrayList<Product4>();
		productsList.add(p1);
		productsList.add(p2);
		productsList.add(p3);
		productsList.add(p4);
		List<Double> productPriceList = productsList.stream().
                map(x->x.price).
                collect(Collectors.toList());
		Set<Double>productPriceList1 =productsList.stream().
				map(x->x.price).
				collect(Collectors.toSet());
		Double sumPrices=productsList.stream().
				collect(Collectors.summingDouble(x->x.price));
		Integer sumId=productsList.stream()
				.collect(Collectors.summingInt(x->x.id));
		Double averages=productsList.stream()
				.collect(Collectors.summingDouble(x->x.price));
		System.out.println(productPriceList);
		System.out.println(productPriceList1);
		System.out.println(sumPrices);
		System.out.println(sumId);
		System.out.println(averages);
	}

}
				


