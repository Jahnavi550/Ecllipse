package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class GFG {
		public static void main(String args[])
		{
			List<Integer> list=Arrays.asList(13,5,7,9,11);
			Stream s=Stream.of(13,5,7,9,11);
			Optional<Integer> answer=list.stream().findAny();
			if(answer.isPresent())
			{
				System.out.println(answer.get());
			}
			else
			{
				System.out.println("no value");
			}
		}
}
