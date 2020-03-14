package webapp;

public class UserMainCode4 {
	public static int findElement(int[] array,int element) {
		boolean found=false;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==element)
			{
				found=true;
				break;
			}
			
		}
		if(found)
			return 1;
		else
			return 0;

	}
	
}
