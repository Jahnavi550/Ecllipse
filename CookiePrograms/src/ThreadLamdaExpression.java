import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/*interface Mathematics
{
	public int add(int a,int b);
}*/
public class ThreadLamdaExpression{
	public static void main(String[] args) {
		/*Runnable r=()->{
			for(int i=0;i<=10;i++)
				System.out.println(i);
		};
		Thread t1=new Thread(r);
		t1.start();
		
		Mathematics m=(a,b)->(a+b);
		System.out.println(m.add(10, 20));*/
		
		Predicate<Integer> p=i->(i%2!=0);
		System.out.println(p.test(10));
		
		Function<Integer,Double> f=i->3.14*i*i;
		System.out.println(f.apply(4));
		
		BiFunction<Integer,Integer,Integer> bf=(a,b)->(a>b)?a:b;
		System.out.println(bf.apply(2,3));
	}

}
