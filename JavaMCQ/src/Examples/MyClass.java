
package Examples; 
/*class Sample
{
	int a,b;
	Sample()
	{
		a=1; 
		b=2;
		System.out.println(a+"\t"+b);
	}
	Sample(int x)
	{ 
		this(10,20);
		a=b=x;
		System.out.println(a+"\t"+b);
	}
	Sample(int a,int b)
	{ 
		this();
		this.a=a;
		this.b=b;
		System.out.println(a+"\t"+b);
	}
}
public class MyClass
{ 
	public static void main(String args[])
	{
		Sample s1=new Sample (100);
	}
}*/


//package Examples;


/*long var;
public void MyClass(long param) { var = param; } // (Line no 1)
public static void main(String[] args) {
MyClass a, b;
a = new MyClass(); // (Line no 2) 
}
}

//boolean b =TRUE;
//byte b1 = 256;
//String s = "null";
//int i = new Integer("56");*/

/*class MyClass
{
	private static void display()
	{ 
		System.out.print("Hi");
	}
	public static void main(String ar[])
	{
		display();
	}
}*/

/*class A
{  	
	int z;
	A(int x)
	{
		z=x;
	}
}
class MyClass extends A
{ 
	public static void main(String arg)
	{
		new MyClass();
	}
}*/

 /* class MyClass{
	static void method(){
		this.display();
	}
	static display(){
		System.out.println("hello");
	}
	public static void main(String[] args){
		new MyClass().method();
	}
}*/

/* public class MyClass {
static void print(String s, int i) {
  System.out.println("String: " + s + ", int: " + i);
}

static void print(int i, String s) {
  System.out.println("int: " + i + ", String: " + s);
}

public static void main(String[] args) {
  print("String first", 11);
  print(99, "Int first");
}
}*/


/* class MyClass{ private static void display(){
System.out.println("Display()");}
private static  void show() { display();
System.out.println("show()");}
public static void main(String arg[]){
show();}}*/


public class MyClass {

			public static void go(long n) {
				System.out.print("Long ");
			}
			public static void go(short n) {
				System.out.print("Short ");
			}
			public static void go(int n) {
				System.out.print("int ");
			}
			public static void main(String [] args) 
			{
				//	System.out.println(Math.ceil(-4.7));
					short y = 6;
					long z = 7;
					go(y);
					go(z);
			}
}



/* public class MyClass {
 public static void main(String arguments[]) {
  amethod(arguments);
 }
 public void amethod(String[] arguments) {
  System.out.println(arguments[0]);
  System.out.println(arguments[1]);
 }
}*/


