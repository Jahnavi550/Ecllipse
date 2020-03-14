package webapp;

public class ExceptionAssignment4 {
	public static void main(String[] args) {
		int n = args.length;
		int[] arr = new int[n];
		int sum = 0;
		double avg = 0;
		try {
			for (int i = 0; i < n; i++)
			{
				arr[i] = Integer.parseInt(args[i]);
				sum += arr[i];
			}
			avg = sum / n;
			System.out.println("sum: " + sum);
			System.out.println("avg: " + avg);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		
	}
}
