package webapp;
abstract class SuperMarket
{
	abstract public void payment();
	abstract public void implementSecurityOnline();
	public void selectProducts()
	{
		System.out.println("Goods are selected as per the base company rule");
	}
	public void shipmentOfGoods()
	{
		System.out.println("Goods will shipment as per the base company rule");
	}
}
class Market1 extends SuperMarket
{
	public void payment()
	{
		System.out.println("cash payment only provided");
	}
	public void implementSecurityOnline()
	{
		System.out.println("no online security provided");
	}
}
class Market2 extends SuperMarket
{
	public void payment()
	{
		System.out.println(" debit card payment only provided");
	}
	public void implementSecurityOnline()
	{
		System.out.println("ssh security provided");
	}
}
public class TestSuperMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Market1 m1=new Market1();
		m1.selectProducts();
		m1.shipmentOfGoods();
		m1.payment();
		m1.implementSecurityOnline();
		Market2 m2=new Market2();
		m2.selectProducts();
		m2.shipmentOfGoods();
		m2.payment();
		m2.implementSecurityOnline();
	}

}
