package webapp;

import java.util.Scanner;
public class ExceptionAssignment3 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print(" enter first number: ");
		int a= s.nextInt();
		System.out.print("enter second number: ");
		int b = s.nextInt();		
		ExceptionAssignment3 e=new ExceptionAssignment3();
		e.division(a,b);		
	}
	public void division(int a, int b)throws ArithmeticException {
		try{
			float c = a/b;
			System.out.println("result is "+c);
		}catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}