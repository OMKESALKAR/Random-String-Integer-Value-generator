package Dec_03_Predicates.RandomValueGenerator;

import java.util.Random;
import java.util.function.Supplier;

public class RandomValueGenerator 
{
	public static void main(String[] args) 
	{
		Supplier<String> stringSupplier = () ->
		{
			Random random = new Random();
			int randomDigit = random.nextInt(100, 9999);
			System.out.print("Generated random string: ");
			return "Predicate "+randomDigit; 
		};
		
		Supplier<Integer> integerSupplier = () ->
		{
			Random random = new Random();
			int randomInteger = random.nextInt(1, 99);
			System.out.print("Generated random Integer: ");
			return randomInteger; 
		};
		
		System.out.println(stringSupplier.get());
		System.out.println(integerSupplier.get());
	}

}
