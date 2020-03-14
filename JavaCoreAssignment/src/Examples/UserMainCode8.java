package Examples;

import java.util.ArrayList;
import java.util.Collections;

public class UserMainCode8 {
	public static ArrayList<Integer> sortMergedArrayList(ArrayList<Integer> a1,ArrayList<Integer> a2)
	{
		a1.addAll(a2);
		Collections.sort(a1);
		ArrayList<Integer> ans=new ArrayList<Integer>();
		ans.add(a1.get(2));
		ans.add(a1.get(6));
		ans.add(a1.get(8));
		return ans;
	}
}