import java.util.Iterator;
import java.util.List;

public class CIList {
	int id;
	String name;
	List definition;
	CIList(int id,String name,List definition)
	{
		this.id=id;
		this.name=name;
		this.definition=definition;
	}
	public void display()
	{
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("definitions are");
		Iterator<String> itr=definition.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}
}
