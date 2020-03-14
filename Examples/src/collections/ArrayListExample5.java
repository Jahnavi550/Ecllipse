package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample5 {
	public static void main(String args[]){
		ArrayList<String> al=new ArrayList<String>();
		al.add("red");
		al.add("blue");
		al.add("green");
		al.add("yellow");
		System.out.println("before insert specific element "+al);
		al.set(0, "purple");
		System.out.println("after insert specific element "+al);
	}
}
