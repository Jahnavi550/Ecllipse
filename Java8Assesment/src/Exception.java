
import java.util.*;
public class Exception
{
    public String getPriceDetails(int n,int arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index of the array element you want to access");
        int element=sc.nextInt();
        try
        {
            for(int i=0;i<arr.length;i++)
            {
                if(n>0&&arr[i]>0)
                {
                    String ans="The array element is "+arr[element];
                    return ans;
                }
                else if(!(n>0&&arr[i]>0))
                {
                    throw new InputMismatchException();
                }
                else
                {
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            String s1="Array index is out of range.";
            return s1;
        }
        catch(InputMismatchException e)
        {
            String s2="Input was not in the correct format.";
            return s2;
        }
        return null;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the price details");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Exception e=new Exception();
        System.out.println(e.getPriceDetails(n,arr));
    }
}
