package Examples;

import java.util.ArrayList;
import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> a1=new ArrayList<Integer>();
		ArrayList<Integer> a2=new ArrayList<Integer>();
		ArrayList<Integer> ans=new ArrayList<Integer>();
		for(int i=0;i<5;i++)
			a1.add(s.nextInt());
		for(int j=0;j<5;j++)
			a2.add(s.nextInt());
		ans=UserMainCode8.sortMergedArrayList(a1,a2);
		for(int k=0;k<3;k++)
			System.out.println(ans.get(k));
	}

}